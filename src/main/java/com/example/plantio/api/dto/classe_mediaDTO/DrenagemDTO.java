package com.example.plantio.api.dto.classe_mediaDTO;

import com.example.plantio.api.model.classe_media.Drenagem;
import lombok.Data;

@Data
public class DrenagemDTO {
    private Long id;
    private String classe;
    private Double areia, argila, silte;

    public DrenagemDTO(Drenagem drenagem) {

        this.id = drenagem.getId();
        this.classe = drenagem.getClasse();
        this.areia = drenagem.getAreia();
        this.argila = drenagem.getArgila();
        this.silte = drenagem.getSilte();
    }

    public static DrenagemDTO create(Drenagem drenagem) { return new DrenagemDTO(drenagem); }
}
