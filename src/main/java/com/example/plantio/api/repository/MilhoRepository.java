package com.example.plantio.api.repository;

import com.example.plantio.api.model.culturas.Milho;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marcos Ribeiro
 */

public interface MilhoRepository extends JpaRepository<Milho, Long> {

}
