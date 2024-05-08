package com.example.plantio.api.repository;

import com.example.plantio.api.model.Zoneamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Marcos Ribeiro
 */

public interface ZoneamentoRepository extends JpaRepository<Zoneamento, Long> {

    List<Zoneamento> findBySafra(String safra);

    List<Zoneamento> findByCultura(String cultura);

    List<Zoneamento> findByUf(String uf);

    List<Zoneamento> findByMunicipio(String municipio);

    List<Zoneamento> findByGrupo(String grupo);

    List<Zoneamento> findBySolo(String solo);

    Optional<Zoneamento> getZoneamentoById(Long id);
}
