package com.example.plantio.api.service.culturasService;

import com.example.plantio.api.dto.culturasDTO.ArrozDTO;
import com.example.plantio.api.model.culturas.Arroz;
import com.example.plantio.api.repository.culturasRepository.ArrozRepository;
import com.example.plantio.api.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;

/**
 * Serviço específico de Arroz que reutiliza a lógica CRUD genérica.
 */
@Service
public class ArrozService extends AbstractCrudService<Arroz, ArrozDTO, ArrozRepository> {

    public ArrozService(ArrozRepository rep) {
        super(rep, ArrozDTO::create);
    }
}
