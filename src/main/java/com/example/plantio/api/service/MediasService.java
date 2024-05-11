package com.example.plantio.api.service;

import com.example.plantio.api.dto.MediasDTO;
import com.example.plantio.api.model.Medias;
import com.example.plantio.api.repository.MediasRepository;
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
public class MediasService {

    @Autowired
    private MediasRepository rep;

    public List<Object> getMedias() { return rep.findAll().stream().map(MediasDTO::create).collect(Collectors.toList()); }

    public Optional<MediasDTO> getMediasById(Long id) { return rep.findById(id).map(MediasDTO::create); }

    public List<MediasDTO> getMediasByClasse(String classe) { return rep.findByClasse(classe).stream().map(MediasDTO::create).collect(Collectors.toList());}

    public List<MediasDTO> getMediasByAreia(Double areia) { return rep.findByAreia(areia).stream().map(MediasDTO::create).collect(Collectors.toList()); }
    
    public List<MediasDTO> getMediasByArgila(Double argila) { return rep.findByArgila(argila).stream().map(MediasDTO::create).collect(Collectors.toList()); }

    public List<MediasDTO> getMediasBySilte(Double silte) { return rep.findBySilte(silte).stream().map(MediasDTO::create).collect(Collectors.toList()); }

    public MediasDTO insert(Medias medias) { Assert.isNull(medias.getId(),"Não foi possível inserir o registro de medias!");
        return MediasDTO.create(rep.save(medias));
    }

    public MediasDTO update(Medias medias, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de medias");

        // Busca as informações de medias no banco de dados
        Optional<Medias> optional = rep.findById(id);
        if(optional.isPresent()) {
            Medias db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setClasse(medias.getClasse());
            db.setAreia(medias.getAreia());
            db.setArgila(medias.getArgila());
            db.setSilte(medias.getSilte());
            System.out.println("Medias id " + db.getId());

            // Atualiza o medias
            rep.save(db);

            return MediasDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de medias! ");
        }
    }

    public boolean delete(Long id) {
        if(getMediasById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
