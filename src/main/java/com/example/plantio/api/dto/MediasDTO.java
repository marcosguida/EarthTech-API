package com.example.plantio.api.dto;

import com.example.plantio.api.model.Medias;
import lombok.Data;

@Data
public class MediasDTO {
    private Long id;
    private String classe;
    private Double areia, argila, silte;

    public MediasDTO(Medias medias) {
        this.id = medias.getId();
        this.classe = medias.getClasse();
        this.areia = medias.getAreia();
        this.argila = medias.getArgila();
        this.silte = medias.getSilte();
    }

    public static MediasDTO create(Medias medias) {
        return new MediasDTO(medias);
    }
}
