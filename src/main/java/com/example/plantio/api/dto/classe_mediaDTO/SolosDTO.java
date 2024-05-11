package com.example.plantio.api.dto.classe_mediaDTO;

import com.example.plantio.api.model.classe_media.Solos;
import lombok.Data;

@Data
public class SolosDTO {
    private Long id;
    private String classe;
    private Double areia, argila, silte, phAgua, fosforo, fosforoAssimilavel, carbono, nitrogenio, aluminioTrocavel;

    public SolosDTO(Solos solos) {

        this.id = solos.getId();
        this.classe = solos.getClasse();
        this.areia = solos.getAreia();
        this.argila = solos.getArgila();
        this.silte = solos.getSilte();
        this.phAgua = solos.getPhAgua();
        this.fosforo = solos.getFosforo();
        this.fosforoAssimilavel = solos.getFosforoAssimilavel();
        this.carbono = solos.getCarbono();
        this.nitrogenio = solos.getNitrogenio();
        this.aluminioTrocavel = solos.getAluminioTrocavel();
    }

    public static SolosDTO create(Solos solos) { return new SolosDTO(solos); }
}

