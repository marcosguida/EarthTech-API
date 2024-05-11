package com.example.plantio.api.model.classe_media;

import com.example.plantio.api.model.Medias;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * @author Marcos Ribeiro
 */

@Entity
@DiscriminatorValue("solos")
public class Solos extends Medias {

    private Double phAgua, fosforo, fosforoAssimilavel, carbono, nitrogenio;

    public Double getPhAgua() {
        return phAgua;
    }

    public void setPhAgua(Double phAgua) {
        this.phAgua = phAgua;
    }

    public Double getFosforo() {
        return fosforo;
    }

    public void setFosforo(Double fosforo) {
        this.fosforo = fosforo;
    }

    public Double getFosforoAssimilavel() {
        return fosforoAssimilavel;
    }

    public void setFosforoAssimilavel(Double fosforoAssimilavel) {
        this.fosforoAssimilavel = fosforoAssimilavel;
    }

    public Double getCarbono() {
        return carbono;
    }

    public void setCarbono(Double carbono) {
        this.carbono = carbono;
    }

    public Double getNitrogenio() {
        return nitrogenio;
    }

    public void setNitrogenio(Double nitrogenio) {
        this.nitrogenio = nitrogenio;
    }

    public Solos() { super(); }

}
