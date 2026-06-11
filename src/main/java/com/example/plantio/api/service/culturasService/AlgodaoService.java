package com.example.plantio.api.service.culturasService;

import com.example.plantio.api.dto.culturasDTO.AlgodaoDTO;
import com.example.plantio.api.model.culturas.Algodao;
import com.example.plantio.api.repository.culturasRepository.AlgodaoRepository;
import com.example.plantio.api.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;

/**
 * Serviço específico de Algodao que reutiliza a lógica CRUD genérica.
 */
@Service
public class AlgodaoService extends AbstractCrudService<Algodao, AlgodaoDTO, AlgodaoRepository> {

    public AlgodaoService(AlgodaoRepository rep) {
        super(rep, AlgodaoDTO::create);
    }
}
