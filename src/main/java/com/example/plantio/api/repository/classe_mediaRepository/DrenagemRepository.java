package com.example.plantio.api.repository.classe_mediaRepository;

import com.example.plantio.api.model.classe_media.Drenagem;
import com.example.plantio.api.model.culturas.Soja;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marcos Ribeiro
 */

public interface DrenagemRepository extends JpaRepository<Drenagem, Long> {

}
