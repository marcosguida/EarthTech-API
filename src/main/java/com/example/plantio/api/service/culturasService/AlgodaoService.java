package com.example.plantio.api.service.culturasService;

import com.example.plantio.api.dto.culturasDTO.AlgodaoDTO;
import com.example.plantio.api.model.culturas.Algodao;
import com.example.plantio.api.repository.culturasRepository.AlgodaoRepository;
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
public class AlgodaoService {
    
    @Autowired
    private AlgodaoRepository rep;

    public List<Object> getAlgodao() { return rep.findAll().stream().map(AlgodaoDTO::create).collect(Collectors.toList()); };

    public Optional<AlgodaoDTO> getAlgodaoById(Long id) { return rep.findById(id).map(AlgodaoDTO::create); }

    public AlgodaoDTO insert(Algodao algodao) { Assert.isNull(algodao.getId(),"Não foi possível inserir o registro de algodao!");
        return AlgodaoDTO.create(rep.save(algodao));
    }

    public AlgodaoDTO update(Algodao algodao, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de algodao");

        // Busca as informações de algodao no banco de dados
        Optional<Algodao> optional = rep.findById(id);
        if(optional.isPresent()) {
            Algodao db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setSafra(algodao.getSafra());
            db.setCultura(algodao.getCultura());
            db.setUf(algodao.getUf());
            db.setMunicipio(algodao.getMunicipio());
            db.setGrupo(algodao.getGrupo());
            db.setSolo(algodao.getSolo());
            db.setRisk1(algodao.getRisk1());
            db.setRisk2(algodao.getRisk2());
            db.setRisk3(algodao.getRisk3());
            db.setRisk4(algodao.getRisk4());
            db.setRisk5(algodao.getRisk5());
            db.setRisk6(algodao.getRisk6());
            db.setRisk7(algodao.getRisk7());
            db.setRisk8(algodao.getRisk8());
            db.setRisk9(algodao.getRisk9());
            db.setRisk10(algodao.getRisk10());
            db.setRisk11(algodao.getRisk11());
            db.setRisk12(algodao.getRisk12());
            db.setRisk13(algodao.getRisk13());
            db.setRisk14(algodao.getRisk14());
            db.setRisk15(algodao.getRisk15());
            db.setRisk16(algodao.getRisk16());
            db.setRisk17(algodao.getRisk17());
            db.setRisk18(algodao.getRisk18());
            db.setRisk19(algodao.getRisk19());
            db.setRisk20(algodao.getRisk20());
            db.setRisk21(algodao.getRisk21());
            db.setRisk22(algodao.getRisk22());
            db.setRisk23(algodao.getRisk23());
            db.setRisk24(algodao.getRisk24());
            db.setRisk25(algodao.getRisk25());
            db.setRisk26(algodao.getRisk26());
            db.setRisk27(algodao.getRisk27());
            db.setRisk28(algodao.getRisk28());
            db.setRisk29(algodao.getRisk29());
            db.setRisk30(algodao.getRisk30());
            db.setRisk31(algodao.getRisk31());
            db.setRisk32(algodao.getRisk32());
            db.setRisk33(algodao.getRisk33());
            db.setRisk34(algodao.getRisk34());
            db.setRisk35(algodao.getRisk35());
            db.setRisk36(algodao.getRisk36());
            System.out.println("Algodao id " + db.getId());

            // Atualiza o algodao
            rep.save(db);

            return AlgodaoDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de algodao! ");
        }
    }

    public boolean delete(Long id) {
        if(getAlgodaoById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
