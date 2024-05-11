package com.example.plantio.api.service.classe_mediaService;

import com.example.plantio.api.dto.classe_mediaDTO.SolosDTO;
import com.example.plantio.api.model.classe_media.Solos;
import com.example.plantio.api.repository.classe_mediaRepository.SolosRepository;
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
public class SolosService {
    
    @Autowired
    private SolosRepository rep;

    public List<Object> getSolos() { return rep.findAll().stream().map(SolosDTO::create).collect(Collectors.toList()); };

    public Optional<SolosDTO> getSolosById(Long id) { return rep.findById(id).map(SolosDTO::create); }

    public List<SolosDTO> getSolosByPhAgua(Double phAgua) { return rep.findByPhAgua(phAgua).stream().map(SolosDTO::create).collect(Collectors.toList()); }

    public List<SolosDTO> getSolosByFosforo(Double fosforo) { return rep.findByFosforo(fosforo).stream().map(SolosDTO::create).collect(Collectors.toList()); }

    public List<SolosDTO> getSolosByFosforoAssimilavel(Double fosforoAssimilavel) { return rep.findByFosforoAssimilavel(fosforoAssimilavel).stream().map(SolosDTO::create).collect(Collectors.toList()); }

    public List<SolosDTO> getSolosByCarbono(Double carbono) { return rep.findByCarbono(carbono).stream().map(SolosDTO::create).collect(Collectors.toList()); }

    public List<SolosDTO> getSolosByNitrogenio(Double nitrogenio) { return rep.findByNitrogenio(nitrogenio).stream().map(SolosDTO::create).collect(Collectors.toList()); }


    public SolosDTO insert(Solos solos) { Assert.isNull(solos.getId(),"Não foi possível inserir o registro de solos!");
        return SolosDTO.create(rep.save(solos));
    }

    public SolosDTO update(Solos solos, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de solos");

        // Busca as informações de solos no banco de dados
        Optional<Solos> optional = rep.findById(id);
        if(optional.isPresent()) {
            Solos db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setClasse(solos.getClasse());
            db.setAreia(solos.getAreia());
            db.setArgila(solos.getArgila());
            db.setSilte(solos.getSilte());
            db.setPhAgua(solos.getPhAgua());
            db.setFosforo(solos.getFosforo());
            db.setFosforoAssimilavel(solos.getFosforoAssimilavel());
            db.setCarbono(solos.getCarbono());
            db.setNitrogenio(solos.getNitrogenio());
            System.out.println("Solos id " + db.getId());

            // Atualiza o solos
            rep.save(db);

            return SolosDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de solos! ");
        }
    }

    public boolean delete(Long id) {
        if(getSolosById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
