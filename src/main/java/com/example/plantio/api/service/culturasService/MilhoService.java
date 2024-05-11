package com.example.plantio.api.service.culturasService;

import com.example.plantio.api.dto.culturasDTO.MilhoDTO;
import com.example.plantio.api.model.culturas.Milho;
import com.example.plantio.api.repository.culturasRepository.MilhoRepository;
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
public class MilhoService {

    @Autowired
    private MilhoRepository rep;

    public List<Object> getMilho() { return rep.findAll().stream().map(MilhoDTO::create).collect(Collectors.toList()); };

    public Optional<MilhoDTO> getMilhoById(Long id) { return rep.findById(id).map(MilhoDTO::create); }

    public MilhoDTO insert(Milho milho) { Assert.isNull(milho.getId(),"Não foi possível inserir o registro de milho!");
        return MilhoDTO.create(rep.save(milho));
    }

    public MilhoDTO update(Milho milho, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de milho");

        // Busca as informações de milho no banco de dados
        Optional<Milho> optional = rep.findById(id);
        if(optional.isPresent()) {
            Milho db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setSafra(milho.getSafra());
            db.setCultura(milho.getCultura());
            db.setUf(milho.getUf());
            db.setMunicipio(milho.getMunicipio());
            db.setGrupo(milho.getGrupo());
            db.setSolo(milho.getSolo());
            db.setRisk1(milho.getRisk1());
            db.setRisk2(milho.getRisk2());
            db.setRisk3(milho.getRisk3());
            db.setRisk4(milho.getRisk4());
            db.setRisk5(milho.getRisk5());
            db.setRisk6(milho.getRisk6());
            db.setRisk7(milho.getRisk7());
            db.setRisk8(milho.getRisk8());
            db.setRisk9(milho.getRisk9());
            db.setRisk10(milho.getRisk10());
            db.setRisk11(milho.getRisk11());
            db.setRisk12(milho.getRisk12());
            db.setRisk13(milho.getRisk13());
            db.setRisk14(milho.getRisk14());
            db.setRisk15(milho.getRisk15());
            db.setRisk16(milho.getRisk16());
            db.setRisk17(milho.getRisk17());
            db.setRisk18(milho.getRisk18());
            db.setRisk19(milho.getRisk19());
            db.setRisk20(milho.getRisk20());
            db.setRisk21(milho.getRisk21());
            db.setRisk22(milho.getRisk22());
            db.setRisk23(milho.getRisk23());
            db.setRisk24(milho.getRisk24());
            db.setRisk25(milho.getRisk25());
            db.setRisk26(milho.getRisk26());
            db.setRisk27(milho.getRisk27());
            db.setRisk28(milho.getRisk28());
            db.setRisk29(milho.getRisk29());
            db.setRisk30(milho.getRisk30());
            db.setRisk31(milho.getRisk31());
            db.setRisk32(milho.getRisk32());
            db.setRisk33(milho.getRisk33());
            db.setRisk34(milho.getRisk34());
            db.setRisk35(milho.getRisk35());
            db.setRisk36(milho.getRisk36());
            System.out.println("Milho id " + db.getId());

            // Atualiza o milho
            rep.save(db);

            return MilhoDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de milho! ");
        }
    }

    public boolean delete(Long id) {
        if(getMilhoById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
