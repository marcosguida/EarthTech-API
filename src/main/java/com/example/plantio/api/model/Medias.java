package com.example.plantio.api.model;

import jakarta.persistence.*;

/**
 * @author Marcos Ribeiro
 */

@Entity
@DiscriminatorColumn(name = "dtype", discriminatorType = DiscriminatorType.STRING)
public class Medias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String classe;
    private Double areia, argila, silte;

    public Medias(Long id, String classe, Double areia, Double argila, Double silte) {

        this.id = id;
        this.classe = classe;
        this.areia = areia;
        this.argila = argila;
        this.silte = silte;
    }

    public Medias() {

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public double getAreia() {
        return areia;
    }

    public void setAreia(double areia) {
        this.areia = areia;
    }

    public double getArgila() {
        return argila;
    }

    public void setArgila(double argila) {
        this.argila = argila;
    }

    public double getSilte() {
        return silte;
    }

    public void setSilte(double silte) {
        this.silte = silte;
    }

}
