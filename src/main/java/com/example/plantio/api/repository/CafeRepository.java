package com.example.plantio.api.repository;

import com.example.plantio.api.model.culturas.Cafe;
import com.example.plantio.api.model.culturas.Soja;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marcos Ribeiro
 */

public interface CafeRepository extends JpaRepository<Cafe, Long> {

}
