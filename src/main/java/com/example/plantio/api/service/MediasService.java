package com.example.plantio.api.service;

import com.example.plantio.api.dto.MediasDTO;
import com.example.plantio.api.model.Medias;
import com.example.plantio.api.repository.MediasRepository;
import com.example.plantio.api.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Serviço específico de Medias que reutiliza a lógica CRUD genérica.
 */
@Service
public class MediasService extends AbstractCrudService<Medias, MediasDTO, MediasRepository> {

    public MediasService(MediasRepository rep) {
        super(rep, MediasDTO::create);
    }

    public List<MediasDTO> getMediasByClasse(String classe) { return rep.findByClasse(classe).stream().map(toDTO).collect(Collectors.toList()); }

    public List<MediasDTO> getMediasByAreia(Double areia) { return rep.findByAreia(areia).stream().map(toDTO).collect(Collectors.toList()); }

    public List<MediasDTO> getMediasByArgila(Double argila) { return rep.findByArgila(argila).stream().map(toDTO).collect(Collectors.toList()); }

    public List<MediasDTO> getMediasBySilte(Double silte) { return rep.findBySilte(silte).stream().map(toDTO).collect(Collectors.toList()); }
}
