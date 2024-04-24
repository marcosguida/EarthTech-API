package com.example.plantio.api.service;

import com.example.plantio.api.model.Zoneamento;
import com.example.plantio.api.repository.ZoneamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

/**
 * @author marcos
 */

@Service
public class ZoneamentoService {

    @Autowired
    private ZoneamentoRepository rep;

    public Iterable<Zoneamento> getZoneamento() {
        return rep.findAll();
    }

    public Optional<Zoneamento> getZoneamentoById(Long id) {
        return rep.findById(id);
    }

    public List<Zoneamento> getZoneamentoBySafra(String safra) {
        return rep.findBySafra(safra);
    }

    public List<Zoneamento> getZoneamentoByMunicipio(String municipio) { return rep.findByMunicipio(municipio); }

    public List<Zoneamento> getZoneamentoByMicrorrregiao(String microrrregiao) { return rep.findByMicrorrregiao(microrrregiao); }

    public List<Zoneamento> getZoneamentoByCultura(String cultura) { return rep.findByCultura(cultura); }

    public List<Zoneamento> getZoneamentoBySolo(String solo) { return rep.findBySolo(solo); }

    public Zoneamento insert(Zoneamento zoneamento) { Assert.isNull(zoneamento.getId(),"Não foi possível inserir o registro de zoneamento!");
        return rep.save(zoneamento);
    }

    public Zoneamento update(Zoneamento zoneamento, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de zoneamento");

        // Busca as informações de zoneamento no banco de dados
        Optional<Zoneamento> optional = rep.findById(id);
        if(optional.isPresent()) {
            Zoneamento db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setSafra(zoneamento.getSafra());
            db.setCultura(zoneamento.getCultura());
            db.setMunicipio(zoneamento.getMunicipio());
            db.setMicrorrregiao(zoneamento.getMicrorrregiao());
            db.setSolo(zoneamento.getSolo());
            System.out.println("Zoneamento id " + db.getId());

            // Atualiza o zoneamento
            rep.save(db);

            return db;
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de zoneamento! ");
        }
    }

    public void delete(Long id) {
        Optional<Zoneamento> zoneamento = rep.getZoneamentoById(id);
        if(zoneamento.isPresent()) {
            rep.deleteById(id);
        }
    }
}
