package com.example.plantio.api.repository;

import com.example.plantio.api.model.Medias;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

/**
 * @author Marcos Ribeiro
 */

public interface MediasRepository extends JpaRepository<Medias, Long> {

    Optional<Medias> getMediasById(Long id);

    List<Medias> findByClasse(String classe);

    List<Medias> findByAreia(Double areia);

    List<Medias> findByArgila(Double argila);

    List<Medias> findBySilte(Double Silte);

}
