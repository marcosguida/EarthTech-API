package com.example.plantio.api.service;

import com.example.plantio.api.dto.ArrozDTO;
import com.example.plantio.api.model.culturas.Arroz;
import com.example.plantio.api.repository.ArrozRepository;
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
public class ArrozService {
    
    @Autowired
    private ArrozRepository rep;

    public List<Object> getArroz() { return rep.findAll().stream().map(ArrozDTO::create).collect(Collectors.toList()); };

    public Optional<ArrozDTO> getArrozById(Long id) { return rep.findById(id).map(ArrozDTO::create); }

    public ArrozDTO insert(Arroz arroz) { Assert.isNull(arroz.getId(),"Não foi possível inserir o registro de arroz!");
        return ArrozDTO.create(rep.save(arroz));
    }

    public ArrozDTO update(Arroz arroz, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de arroz");

        // Busca as informações de arroz no banco de dados
        Optional<Arroz> optional = rep.findById(id);
        if(optional.isPresent()) {
            Arroz db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setSafra(arroz.getSafra());
            db.setCultura(arroz.getCultura());
            db.setUf(arroz.getUf());
            db.setMunicipio(arroz.getMunicipio());
            db.setGrupo(arroz.getGrupo());
            db.setSolo(arroz.getSolo());
            db.setRisk1(arroz.getRisk1());
            db.setRisk2(arroz.getRisk2());
            db.setRisk3(arroz.getRisk3());
            db.setRisk4(arroz.getRisk4());
            db.setRisk5(arroz.getRisk5());
            db.setRisk6(arroz.getRisk6());
            db.setRisk7(arroz.getRisk7());
            db.setRisk8(arroz.getRisk8());
            db.setRisk9(arroz.getRisk9());
            db.setRisk10(arroz.getRisk10());
            db.setRisk11(arroz.getRisk11());
            db.setRisk12(arroz.getRisk12());
            db.setRisk13(arroz.getRisk13());
            db.setRisk14(arroz.getRisk14());
            db.setRisk15(arroz.getRisk15());
            db.setRisk16(arroz.getRisk16());
            db.setRisk17(arroz.getRisk17());
            db.setRisk18(arroz.getRisk18());
            db.setRisk19(arroz.getRisk19());
            db.setRisk20(arroz.getRisk20());
            db.setRisk21(arroz.getRisk21());
            db.setRisk22(arroz.getRisk22());
            db.setRisk23(arroz.getRisk23());
            db.setRisk24(arroz.getRisk24());
            db.setRisk25(arroz.getRisk25());
            db.setRisk26(arroz.getRisk26());
            db.setRisk27(arroz.getRisk27());
            db.setRisk28(arroz.getRisk28());
            db.setRisk29(arroz.getRisk29());
            db.setRisk30(arroz.getRisk30());
            db.setRisk31(arroz.getRisk31());
            db.setRisk32(arroz.getRisk32());
            db.setRisk33(arroz.getRisk33());
            db.setRisk34(arroz.getRisk34());
            db.setRisk35(arroz.getRisk35());
            db.setRisk36(arroz.getRisk36());
            System.out.println("Arroz id " + db.getId());

            // Atualiza o arroz
            rep.save(db);

            return ArrozDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de arroz! ");
        }
    }

    public boolean delete(Long id) {
        if(getArrozById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
