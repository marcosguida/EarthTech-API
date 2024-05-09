package com.example.plantio.api.service;

import com.example.plantio.api.dto.SojaDTO;
import com.example.plantio.api.model.culturas.Soja;
import com.example.plantio.api.repository.SojaRepository;
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
public class SojaService {
    
    @Autowired
    private SojaRepository rep;

    public List<Object> getSoja() { return rep.findAll().stream().map(SojaDTO::create).collect(Collectors.toList()); };

    public Optional<SojaDTO> getSojaById(Long id) { return rep.findById(id).map(SojaDTO::create); }

    public SojaDTO insert(Soja soja) { Assert.isNull(soja.getId(),"Não foi possível inserir o registro de soja!");
        return SojaDTO.create(rep.save(soja));
    }

    public SojaDTO update(Soja soja, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de soja");

        // Busca as informações de soja no banco de dados
        Optional<Soja> optional = rep.findById(id);
        if(optional.isPresent()) {
            Soja db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setSafra(soja.getSafra());
            db.setCultura(soja.getCultura());
            db.setUf(soja.getUf());
            db.setMunicipio(soja.getMunicipio());
            db.setGrupo(soja.getGrupo());
            db.setSolo(soja.getSolo());
            db.setRisk1(soja.getRisk1());
            db.setRisk2(soja.getRisk2());
            db.setRisk3(soja.getRisk3());
            db.setRisk4(soja.getRisk4());
            db.setRisk5(soja.getRisk5());
            db.setRisk6(soja.getRisk6());
            db.setRisk7(soja.getRisk7());
            db.setRisk8(soja.getRisk8());
            db.setRisk9(soja.getRisk9());
            db.setRisk10(soja.getRisk10());
            db.setRisk11(soja.getRisk11());
            db.setRisk12(soja.getRisk12());
            db.setRisk13(soja.getRisk13());
            db.setRisk14(soja.getRisk14());
            db.setRisk15(soja.getRisk15());
            db.setRisk16(soja.getRisk16());
            db.setRisk17(soja.getRisk17());
            db.setRisk18(soja.getRisk18());
            db.setRisk19(soja.getRisk19());
            db.setRisk20(soja.getRisk20());
            db.setRisk21(soja.getRisk21());
            db.setRisk22(soja.getRisk22());
            db.setRisk23(soja.getRisk23());
            db.setRisk24(soja.getRisk24());
            db.setRisk25(soja.getRisk25());
            db.setRisk26(soja.getRisk26());
            db.setRisk27(soja.getRisk27());
            db.setRisk28(soja.getRisk28());
            db.setRisk29(soja.getRisk29());
            db.setRisk30(soja.getRisk30());
            db.setRisk31(soja.getRisk31());
            db.setRisk32(soja.getRisk32());
            db.setRisk33(soja.getRisk33());
            db.setRisk34(soja.getRisk34());
            db.setRisk35(soja.getRisk35());
            db.setRisk36(soja.getRisk36());
            System.out.println("Soja id " + db.getId());

            // Atualiza o soja
            rep.save(db);

            return SojaDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de soja! ");
        }
    }

    public boolean delete(Long id) {
        if(getSojaById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
