package com.example.plantio.api.service.classe_mediaService;

import com.example.plantio.api.dto.classe_mediaDTO.DrenagemDTO;
import com.example.plantio.api.model.classe_media.Drenagem;
import com.example.plantio.api.repository.classe_mediaRepository.DrenagemRepository;
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
public class DrenagemService {
    
    @Autowired
    private DrenagemRepository rep;

    public List<Object> getDrenagem() { return rep.findAll().stream().map(DrenagemDTO::create).collect(Collectors.toList()); };

    public Optional<DrenagemDTO> getDrenagemById(Long id) { return rep.findById(id).map(DrenagemDTO::create); }

    public DrenagemDTO insert(Drenagem drenagem) { Assert.isNull(drenagem.getId(),"Não foi possível inserir o registro de drenagem!");
        return DrenagemDTO.create(rep.save(drenagem));
    }

    public DrenagemDTO update(Drenagem drenagem, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de drenagem");

        // Busca as informações de drenagem no banco de dados
        Optional<Drenagem> optional = rep.findById(id);
        if(optional.isPresent()) {
            Drenagem db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setClasse(drenagem.getClasse());
            db.setAreia(drenagem.getAreia());
            db.setArgila(drenagem.getArgila());
            db.setSilte(drenagem.getSilte());
            System.out.println("Drenagem id " + db.getId());

            // Atualiza o drenagem
            rep.save(db);

            return DrenagemDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de drenagem! ");
        }
    }

    public boolean delete(Long id) {
        if(getDrenagemById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
