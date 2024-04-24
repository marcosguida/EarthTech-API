package com.example.plantio.api.repository;

import com.example.plantio.api.model.Zoneamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author marcos
 */

public interface ZoneamentoRepository extends CrudRepository<Zoneamento, Long> {

    List<Zoneamento> findBySafra(String safra);

    List<Zoneamento> findByCultura(String cultura);

    List<Zoneamento> findByMunicipio(String municipio);

    List<Zoneamento> findByMicrorrregiao(String microrrregiao);

    List<Zoneamento> findBySolo(String solo);

    Optional<Zoneamento> getZoneamentoById(Long id);
}
