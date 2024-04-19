package com.example.plantio.api.repository;

import com.example.plantio.api.model.Zoneamento;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

/**
 * @author marcos
 */

public interface ZoneamentoRepository extends CrudRepository<Zoneamento, Long> {

    Iterable<Zoneamento> findBySafra(String safra);

    Iterable<Zoneamento> findByCultura(String cultura);

    Iterable<Zoneamento> findByMunicipio(String municipio);

    Iterable<Zoneamento> findByMicrorrregiao(String microrrregiao);

    Iterable<Zoneamento> findBySolo(String solo);

    Optional<Zoneamento> getZoneamentoById(Long id);
}
