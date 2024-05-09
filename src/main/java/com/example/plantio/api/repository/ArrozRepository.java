package com.example.plantio.api.repository;

import com.example.plantio.api.model.culturas.Arroz;
import com.example.plantio.api.model.culturas.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marcos Ribeiro
 */

public interface ArrozRepository extends JpaRepository<Arroz, Long> {

}
