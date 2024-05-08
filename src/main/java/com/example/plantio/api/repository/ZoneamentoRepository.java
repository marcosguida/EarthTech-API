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

    List<Zoneamento> findByRisk1(int risk1);
    List<Zoneamento> findByRisk2(int risk2);
    List<Zoneamento> findByRisk3(int risk3);
    List<Zoneamento> findByRisk4(int risk4);
    List<Zoneamento> findByRisk5(int risk5);
    List<Zoneamento> findByRisk6(int risk6);
    List<Zoneamento> findByRisk7(int risk7);
    List<Zoneamento> findByRisk8(int risk8);
    List<Zoneamento> findByRisk9(int risk9);
    List<Zoneamento> findByRisk10(int risk10);
    List<Zoneamento> findByRisk11(int risk11);
    List<Zoneamento> findByRisk12(int risk12);
    List<Zoneamento> findByRisk13(int risk13);
    List<Zoneamento> findByRisk14(int risk14);
    List<Zoneamento> findByRisk15(int risk15);
    List<Zoneamento> findByRisk16(int risk16);
    List<Zoneamento> findByRisk17(int risk17);
    List<Zoneamento> findByRisk18(int risk18);
    List<Zoneamento> findByRisk19(int risk19);
    List<Zoneamento> findByRisk20(int risk20);
    List<Zoneamento> findByRisk21(int risk21);
    List<Zoneamento> findByRisk22(int risk22);
    List<Zoneamento> findByRisk23(int risk23);
    List<Zoneamento> findByRisk24(int risk24);
    List<Zoneamento> findByRisk25(int risk25);
    List<Zoneamento> findByRisk26(int risk26);
    List<Zoneamento> findByRisk27(int risk27);
    List<Zoneamento> findByRisk28(int risk28);
    List<Zoneamento> findByRisk29(int risk29);
    List<Zoneamento> findByRisk30(int risk30);
    List<Zoneamento> findByRisk31(int risk31);
    List<Zoneamento> findByRisk32(int risk32);
    List<Zoneamento> findByRisk33(int risk33);
    List<Zoneamento> findByRisk34(int risk34);
    List<Zoneamento> findByRisk35(int risk35);
    List<Zoneamento> findByRisk36(int risk36);

}
