package com.example.plantio.api.service.base;

import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Serviço abstrato genérico para operações CRUD comuns.
 * T: entidade JPA
 * D: DTO de saída
 * R: repositório JPA para T
 */
public abstract class AbstractCrudService<T, D, R extends JpaRepository<T, Long>> {

    protected final R rep;
    protected final Function<T, D> toDTO;

    protected AbstractCrudService(R rep, Function<T, D> toDTO) {
        this.rep = rep;
        this.toDTO = toDTO;
    }

    public List<Object> getAll() {
        return rep.findAll().stream().map(toDTO).collect(Collectors.toList());
    }

    public Optional<D> getById(Long id) {
        return rep.findById(id).map(toDTO);
    }

    public D insert(T entity) {
        Assert.isNull(getEntityId(entity), "Não foi possível inserir o registro: id deve ser nulo");
        return toDTO.apply(rep.save(entity));
    }

    public D update(T entity, Long id) {
        Assert.notNull(id, "Não foi possível atualizar o registro: id nulo");
        Optional<T> optional = rep.findById(id);
        if (optional.isPresent()) {
            T db = optional.get();
            // copia propriedades do request para a entidade do banco, preservando id
            BeanUtils.copyProperties(entity, db, "id");
            setEntityId(db, id);
            rep.save(db);
            return toDTO.apply(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro! ");
        }
    }

    public boolean delete(Long id) {
        if (getById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }

    private Long getEntityId(T entity) {
        try {
            Method m = entity.getClass().getMethod("getId");
            Object v = m.invoke(entity);
            return v == null ? null : (Long) v;
        } catch (Exception ex) {
            return null;
        }
    }

    private void setEntityId(T entity, Long id) {
        try {
            Method m = entity.getClass().getMethod("setId", Long.class);
            m.invoke(entity, id);
        } catch (Exception ex) {
            // ignore se não existir
        }
    }
}
