package com.example.plantio.api.repository.classe_mediaRepository;
import com.example.plantio.api.model.classe_media.Solos;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * @author Marcos Ribeiro
 */

public interface SolosRepository extends JpaRepository<Solos, Long> {

    List<Solos> findByPhAgua(Double phAgua);

    List<Solos> findByFosforo(Double fosforo);

    List<Solos> findByFosforoAssimilavel(Double fosforoAssimilavel);

    List<Solos> findByCarbono(Double carbono);

    List<Solos> findByNitrogenio(Double nitrogenio);

    List<Solos> findByAluminioTrocavel(Double aluminioTrocavel);

}
