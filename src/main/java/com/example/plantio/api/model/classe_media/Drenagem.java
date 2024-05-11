package com.example.plantio.api.model.classe_media;

import com.example.plantio.api.model.Medias;
import jakarta.persistence.*;

/**
 * @author Marcos Ribeiro
 */

@Entity
@DiscriminatorValue("drenagem")
public class Drenagem extends Medias {

    public Drenagem(Long id, String classe, Double areia, Double argila, Double silte){

        super(id, classe, areia, argila, silte) ;
    }

    public Drenagem() { super(); }
}
