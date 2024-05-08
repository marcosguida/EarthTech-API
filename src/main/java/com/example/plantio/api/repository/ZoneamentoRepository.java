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

    Optional<Zoneamento> getZoneamentoById(Long id);

    List<Zoneamento> findBySafra(String safra);

    List<Zoneamento> findByCultura(String cultura);

    List<Zoneamento> findByUf(String uf);

    List<Zoneamento> findByMunicipio(String municipio);

    List<Zoneamento> findByGrupo(String grupo);

    List<Zoneamento> findBySolo(String solo);

    List<Zoneamento> findByRisk1(Long risk1);
    List<Zoneamento> findByRisk2(Long risk2);
    List<Zoneamento> findByRisk3(Long risk3);
    List<Zoneamento> findByRisk4(Long risk4);
    List<Zoneamento> findByRisk5(Long risk5);
    List<Zoneamento> findByRisk6(Long risk6);
    List<Zoneamento> findByRisk7(Long risk7);
    List<Zoneamento> findByRisk8(Long risk8);
    List<Zoneamento> findByRisk9(Long risk9);
    List<Zoneamento> findByRisk10(Long risk10);
    List<Zoneamento> findByRisk11(Long risk11);
    List<Zoneamento> findByRisk12(Long risk12);
    List<Zoneamento> findByRisk13(Long risk13);
    List<Zoneamento> findByRisk14(Long risk14);
    List<Zoneamento> findByRisk15(Long risk15);
    List<Zoneamento> findByRisk16(Long risk16);
    List<Zoneamento> findByRisk17(Long risk17);
    List<Zoneamento> findByRisk18(Long risk18);
    List<Zoneamento> findByRisk19(Long risk19);
    List<Zoneamento> findByRisk20(Long risk20);
    List<Zoneamento> findByRisk21(Long risk21);
    List<Zoneamento> findByRisk22(Long risk22);
    List<Zoneamento> findByRisk23(Long risk23);
    List<Zoneamento> findByRisk24(Long risk24);
    List<Zoneamento> findByRisk25(Long risk25);
    List<Zoneamento> findByRisk26(Long risk26);
    List<Zoneamento> findByRisk27(Long risk27);
    List<Zoneamento> findByRisk28(Long risk28);
    List<Zoneamento> findByRisk29(Long risk29);
    List<Zoneamento> findByRisk30(Long risk30);
    List<Zoneamento> findByRisk31(Long risk31);
    List<Zoneamento> findByRisk32(Long risk32);
    List<Zoneamento> findByRisk33(Long risk33);
    List<Zoneamento> findByRisk34(Long risk34);
    List<Zoneamento> findByRisk35(Long risk35);
    List<Zoneamento> findByRisk36(Long risk36);

}
