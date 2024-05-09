package com.example.plantio.api.service;

import com.example.plantio.api.dto.FeijaoDTO;
import com.example.plantio.api.model.culturas.Feijao;
import com.example.plantio.api.repository.FeijaoRepository;
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
public class FeijaoService {

    @Autowired
    private FeijaoRepository rep;

    public List<Object> getFeijao() { return rep.findAll().stream().map(FeijaoDTO::create).collect(Collectors.toList()); };

    public Optional<FeijaoDTO> getFeijaoById(Long id) { return rep.findById(id).map(FeijaoDTO::create); }

    public FeijaoDTO insert(Feijao feijao) { Assert.isNull(feijao.getId(),"Não foi possível inserir o registro de feijao!");
        return FeijaoDTO.create(rep.save(feijao));
    }

    public FeijaoDTO update(Feijao feijao, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de feijao");

        // Busca as informações de feijao no banco de dados
        Optional<Feijao> optional = rep.findById(id);
        if(optional.isPresent()) {
            Feijao db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setSafra(feijao.getSafra());
            db.setCultura(feijao.getCultura());
            db.setUf(feijao.getUf());
            db.setMunicipio(feijao.getMunicipio());
            db.setGrupo(feijao.getGrupo());
            db.setSolo(feijao.getSolo());
            db.setRisk1(feijao.getRisk1());
            db.setRisk2(feijao.getRisk2());
            db.setRisk3(feijao.getRisk3());
            db.setRisk4(feijao.getRisk4());
            db.setRisk5(feijao.getRisk5());
            db.setRisk6(feijao.getRisk6());
            db.setRisk7(feijao.getRisk7());
            db.setRisk8(feijao.getRisk8());
            db.setRisk9(feijao.getRisk9());
            db.setRisk10(feijao.getRisk10());
            db.setRisk11(feijao.getRisk11());
            db.setRisk12(feijao.getRisk12());
            db.setRisk13(feijao.getRisk13());
            db.setRisk14(feijao.getRisk14());
            db.setRisk15(feijao.getRisk15());
            db.setRisk16(feijao.getRisk16());
            db.setRisk17(feijao.getRisk17());
            db.setRisk18(feijao.getRisk18());
            db.setRisk19(feijao.getRisk19());
            db.setRisk20(feijao.getRisk20());
            db.setRisk21(feijao.getRisk21());
            db.setRisk22(feijao.getRisk22());
            db.setRisk23(feijao.getRisk23());
            db.setRisk24(feijao.getRisk24());
            db.setRisk25(feijao.getRisk25());
            db.setRisk26(feijao.getRisk26());
            db.setRisk27(feijao.getRisk27());
            db.setRisk28(feijao.getRisk28());
            db.setRisk29(feijao.getRisk29());
            db.setRisk30(feijao.getRisk30());
            db.setRisk31(feijao.getRisk31());
            db.setRisk32(feijao.getRisk32());
            db.setRisk33(feijao.getRisk33());
            db.setRisk34(feijao.getRisk34());
            db.setRisk35(feijao.getRisk35());
            db.setRisk36(feijao.getRisk36());
            System.out.println("Feijao id " + db.getId());

            // Atualiza o feijao
            rep.save(db);

            return FeijaoDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de feijao! ");
        }
    }

    public boolean delete(Long id) {
        if(getFeijaoById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
