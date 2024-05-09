package com.example.plantio.api.repository.culturasRepository;

import com.example.plantio.api.model.culturas.Algodao;
import com.example.plantio.api.model.culturas.Soja;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marcos Ribeiro
 */

public interface AlgodaoRepository extends JpaRepository<Algodao, Long> {

}
