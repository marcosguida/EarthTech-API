package com.example.plantio.api.service.culturasService;

import com.example.plantio.api.dto.culturasDTO.SojaDTO;
import com.example.plantio.api.model.culturas.Soja;
import com.example.plantio.api.repository.culturasRepository.SojaRepository;
import com.example.plantio.api.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;

/**
 * Serviço específico de Soja que reutiliza a lógica CRUD genérica.
 */
@Service
public class SojaService extends AbstractCrudService<Soja, SojaDTO, SojaRepository> {

    public SojaService(SojaRepository rep) {
        super(rep, SojaDTO::create);
    }
}
