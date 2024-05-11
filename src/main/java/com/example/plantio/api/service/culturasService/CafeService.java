package com.example.plantio.api.service.culturasService;

import com.example.plantio.api.dto.culturasDTO.CafeDTO;
import com.example.plantio.api.model.culturas.Cafe;
import com.example.plantio.api.repository.culturasRepository.CafeRepository;
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
public class CafeService {
    
    @Autowired
    private CafeRepository rep;

    public List<Object> getCafe() { return rep.findAll().stream().map(CafeDTO::create).collect(Collectors.toList()); };

    public Optional<CafeDTO> getCafeById(Long id) { return rep.findById(id).map(CafeDTO::create); }

    public CafeDTO insert(Cafe cafe) { Assert.isNull(cafe.getId(),"Não foi possível inserir o registro de cafe!");
        return CafeDTO.create(rep.save(cafe));
    }

    public CafeDTO update(Cafe cafe, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de cafe");

        // Busca as informações de cafe no banco de dados
        Optional<Cafe> optional = rep.findById(id);
        if(optional.isPresent()) {
            Cafe db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setSafra(cafe.getSafra());
            db.setCultura(cafe.getCultura());
            db.setUf(cafe.getUf());
            db.setMunicipio(cafe.getMunicipio());
            db.setGrupo(cafe.getGrupo());
            db.setSolo(cafe.getSolo());
            db.setRisk1(cafe.getRisk1());
            db.setRisk2(cafe.getRisk2());
            db.setRisk3(cafe.getRisk3());
            db.setRisk4(cafe.getRisk4());
            db.setRisk5(cafe.getRisk5());
            db.setRisk6(cafe.getRisk6());
            db.setRisk7(cafe.getRisk7());
            db.setRisk8(cafe.getRisk8());
            db.setRisk9(cafe.getRisk9());
            db.setRisk10(cafe.getRisk10());
            db.setRisk11(cafe.getRisk11());
            db.setRisk12(cafe.getRisk12());
            db.setRisk13(cafe.getRisk13());
            db.setRisk14(cafe.getRisk14());
            db.setRisk15(cafe.getRisk15());
            db.setRisk16(cafe.getRisk16());
            db.setRisk17(cafe.getRisk17());
            db.setRisk18(cafe.getRisk18());
            db.setRisk19(cafe.getRisk19());
            db.setRisk20(cafe.getRisk20());
            db.setRisk21(cafe.getRisk21());
            db.setRisk22(cafe.getRisk22());
            db.setRisk23(cafe.getRisk23());
            db.setRisk24(cafe.getRisk24());
            db.setRisk25(cafe.getRisk25());
            db.setRisk26(cafe.getRisk26());
            db.setRisk27(cafe.getRisk27());
            db.setRisk28(cafe.getRisk28());
            db.setRisk29(cafe.getRisk29());
            db.setRisk30(cafe.getRisk30());
            db.setRisk31(cafe.getRisk31());
            db.setRisk32(cafe.getRisk32());
            db.setRisk33(cafe.getRisk33());
            db.setRisk34(cafe.getRisk34());
            db.setRisk35(cafe.getRisk35());
            db.setRisk36(cafe.getRisk36());
            System.out.println("Cafe id " + db.getId());

            // Atualiza o cafe
            rep.save(db);

            return CafeDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de cafe! ");
        }
    }

    public boolean delete(Long id) {
        if(getCafeById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
