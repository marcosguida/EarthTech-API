package com.example.plantio.api.service.culturasService;

import com.example.plantio.api.dto.culturasDTO.FeijaoDTO;
import com.example.plantio.api.model.culturas.Feijao;
import com.example.plantio.api.repository.culturasRepository.FeijaoRepository;
import com.example.plantio.api.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;

/**
 * Serviço específico de Feijao que reutiliza a lógica CRUD genérica.
 */
@Service
public class FeijaoService extends AbstractCrudService<Feijao, FeijaoDTO, FeijaoRepository> {

    public FeijaoService(FeijaoRepository rep) {
        super(rep, FeijaoDTO::create);
    }
}
