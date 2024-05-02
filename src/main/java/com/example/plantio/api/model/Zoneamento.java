package com.example.plantio.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author Marcos Ribeiro
 */

@Entity
public class Zoneamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String safra;
    private String cultura;
    private String municipio;
    private String microrregiao;
    private String solo;

    public Zoneamento(Long id, String safra, String cultura, String municipio, String microrregiao, String solo) {
        this.id = id;
        this.safra = safra;
        this.cultura = cultura;
        this.municipio = municipio;
        this.microrregiao = microrregiao;
        this.solo = solo;
    }

    public Zoneamento() {

    }
    public String getSafra() {
        return safra;
    }

    public void setSafra(String safra) {
        this.safra = safra;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getMicrorregiao() {
        return microrregiao;
    }

    public void setMicrorregiao(String microrregiao) {
        this.microrregiao = microrregiao;
    }

    public String getSolo() {
        return solo;
    }

    public void setSolo(String solo) {
        this.solo = solo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
