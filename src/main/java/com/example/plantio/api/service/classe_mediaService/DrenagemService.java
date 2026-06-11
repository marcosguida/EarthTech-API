package com.example.plantio.api.service.classe_mediaService;

import com.example.plantio.api.dto.classe_mediaDTO.DrenagemDTO;
import com.example.plantio.api.model.classe_media.Drenagem;
import com.example.plantio.api.repository.classe_mediaRepository.DrenagemRepository;
import com.example.plantio.api.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;

/**
 * Serviço específico de Drenagem que reutiliza a lógica CRUD genérica.
 */
@Service
public class DrenagemService extends AbstractCrudService<Drenagem, DrenagemDTO, DrenagemRepository> {

    public DrenagemService(DrenagemRepository rep) {
        super(rep, DrenagemDTO::create);
    }
}
