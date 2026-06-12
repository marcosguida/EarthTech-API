package com.example.plantio.api.service.culturasService;

import com.example.plantio.api.dto.culturasDTO.MilhoDTO;
import com.example.plantio.api.model.culturas.Milho;
import com.example.plantio.api.repository.culturasRepository.MilhoRepository;
import com.example.plantio.api.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;

/**
 * Serviço específico de Milho que reutiliza a lógica CRUD genérica.
 */
@Service
public class MilhoService extends AbstractCrudService<Milho, MilhoDTO, MilhoRepository> {

    public MilhoService(MilhoRepository rep) {
        super(rep, MilhoDTO::create);
    }
}
