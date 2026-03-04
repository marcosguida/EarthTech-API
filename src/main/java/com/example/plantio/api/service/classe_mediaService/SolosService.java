package com.example.plantio.api.service.classe_mediaService;

import com.example.plantio.api.dto.classe_mediaDTO.SolosDTO;
import com.example.plantio.api.model.classe_media.Solos;
import com.example.plantio.api.repository.classe_mediaRepository.SolosRepository;
import com.example.plantio.api.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;

/**
 * Serviço específico de Solos que reutiliza a lógica CRUD genérica.
 */
@Service
public class SolosService extends AbstractCrudService<Solos, SolosDTO, SolosRepository> {

    public SolosService(SolosRepository rep) {
        super(rep, SolosDTO::create);
    }
}
