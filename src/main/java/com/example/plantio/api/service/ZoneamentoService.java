package com.example.plantio.api.service;

import com.example.plantio.api.dto.ZoneamentoDTO;
import com.example.plantio.api.model.Zoneamento;
import com.example.plantio.api.repository.ZoneamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Marcos Ribeiro
 */

@Service
public class ZoneamentoService {

    @Autowired
    private ZoneamentoRepository rep;

    public List<Object> getZoneamento() { return rep.findAll().stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); };

    public Optional<ZoneamentoDTO> getZoneamentoById(Long id) { return rep.findById(id).map(ZoneamentoDTO::create); }

    public List<ZoneamentoDTO> getZoneamentoBySafra(String safra) { return rep.findBySafra(safra).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());}

    public List<ZoneamentoDTO> getZoneamentoByCultura(String cultura) { return rep.findByCultura(cultura).stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoByDescricao(String descricao) { return rep.findByDescricao(descricao).stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoByMunicipio(String municipio) { return rep.findByMunicipio(municipio).stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoBymicrorregiao(String microrregiao) { return rep.findBymicrorregiao(microrregiao).stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoBySolo(String solo) { return rep.findBySolo(solo).stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); }

    public ZoneamentoDTO insert(Zoneamento zoneamento) { Assert.isNull(zoneamento.getId(),"Não foi possível inserir o registro de zoneamento!");
        return ZoneamentoDTO.create(rep.save(zoneamento));
    }

    public ZoneamentoDTO update(Zoneamento zoneamento, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de zoneamento");

        // Busca as informações de zoneamento no banco de dados
        Optional<Zoneamento> optional = rep.findById(id);
        if(optional.isPresent()) {
            Zoneamento db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setSafra(zoneamento.getSafra());
            db.setCultura(zoneamento.getCultura());
            db.setDescricao(zoneamento.getDescricao());
            db.setMunicipio(zoneamento.getMunicipio());
            db.setMicrorregiao(zoneamento.getMicrorregiao());
            db.setSolo(zoneamento.getSolo());
            System.out.println("Zoneamento id " + db.getId());

            // Atualiza o zoneamento
            rep.save(db);

            return ZoneamentoDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de zoneamento! ");
        }
    }

    public boolean delete(Long id) {
        if(getZoneamentoById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
