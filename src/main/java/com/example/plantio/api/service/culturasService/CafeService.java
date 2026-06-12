package com.example.plantio.api.service.culturasService;

import com.example.plantio.api.dto.culturasDTO.CafeDTO;
import com.example.plantio.api.model.culturas.Cafe;
import com.example.plantio.api.repository.culturasRepository.CafeRepository;
import com.example.plantio.api.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;

/**
 * Serviço específico de Cafe que reutiliza a lógica CRUD genérica.
 */
@Service
public class CafeService extends AbstractCrudService<Cafe, CafeDTO, CafeRepository> {

    public CafeService(CafeRepository rep) {
        super(rep, CafeDTO::create);
    }
}
