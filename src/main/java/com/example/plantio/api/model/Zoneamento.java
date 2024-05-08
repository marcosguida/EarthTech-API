package com.example.plantio.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NonNull;

/**
 * @author Marcos Ribeiro
 */

@Entity
public class Zoneamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String safra;
    private String cultura;
    private String uf;
    private String municipio;
    private String grupo;
    private String solo;
    private int risk1, risk2, risk3, risk4, risk5, risk6, risk7, risk8, risk9, risk10;
    private int risk11, risk12, risk13, risk14, risk15, risk16, risk17, risk18, risk19;
    private int risk20, risk21, risk22, risk23, risk24, risk25, risk26, risk27, risk28, risk29;
    private int risk30, risk31, risk32, risk33, risk34, risk35, risk36;

    public Zoneamento(Long id, String safra, String cultura, String uf, String municipio, String grupo, String solo) {
        this.id = id;
        this.safra = safra;
        this.cultura = cultura;
        this.uf = uf;
        this.municipio = municipio;
        this.grupo = grupo;
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

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
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

    public String getUf() { return uf; }

    public void setUf(String uf) { this.uf = uf; }

    public int getRisk1() {
        return risk1;
    }

    public void setRisk1(int risk1) {
        this.risk1 = risk1;
    }

    public int getRisk2() {
        return risk2;
    }

    public void setRisk2(int risk2) {
        this.risk2 = risk2;
    }

    public int getRisk3() {
        return risk3;
    }

    public void setRisk3(int risk3) {
        this.risk3 = risk3;
    }

    public int getRisk4() {
        return risk4;
    }

    public void setRisk4(int risk4) {
        this.risk4 = risk4;
    }

    public int getRisk5() {
        return risk5;
    }

    public void setRisk5(int risk5) {
        this.risk5 = risk5;
    }

    public int getRisk6() {
        return risk6;
    }

    public void setRisk6(int risk6) {
        this.risk6 = risk6;
    }

    public int getRisk7() {
        return risk7;
    }

    public void setRisk7(int risk7) {
        this.risk7 = risk7;
    }

    public int getRisk8() {
        return risk8;
    }

    public void setRisk8(int risk8) {
        this.risk8 = risk8;
    }

    public int getRisk9() {
        return risk9;
    }

    public void setRisk9(int risk9) {
        this.risk9 = risk9;
    }

    public int getRisk10() {
        return risk10;
    }

    public void setRisk10(int risk10) {
        this.risk10 = risk10;
    }

    public int getRisk11() {
        return risk11;
    }

    public void setRisk11(int risk11) {
        this.risk11 = risk11;
    }

    public int getRisk12() {
        return risk12;
    }

    public void setRisk12(int risk12) {
        this.risk12 = risk12;
    }

    public int getRisk13() {
        return risk13;
    }

    public void setRisk13(int risk13) {
        this.risk13 = risk13;
    }

    public int getRisk14() {
        return risk14;
    }

    public void setRisk14(int risk14) {
        this.risk14 = risk14;
    }

    public int getRisk15() {
        return risk15;
    }

    public void setRisk15(int risk15) {
        this.risk15 = risk15;
    }

    public int getRisk16() {
        return risk16;
    }

    public void setRisk16(int risk16) {
        this.risk16 = risk16;
    }

    public int getRisk17() {
        return risk17;
    }

    public void setRisk17(int risk17) {
        this.risk17 = risk17;
    }

    public int getRisk18() {
        return risk18;
    }

    public void setRisk18(int risk18) {
        this.risk18 = risk18;
    }

    public int getRisk19() {
        return risk19;
    }

    public void setRisk19(int risk19) {
        this.risk19 = risk19;
    }

    public int getRisk20() {
        return risk20;
    }

    public void setRisk20(int risk20) {
        this.risk20 = risk20;
    }

    public int getRisk21() {
        return risk21;
    }

    public void setRisk21(int risk21) {
        this.risk21 = risk21;
    }

    public int getRisk22() {
        return risk22;
    }

    public void setRisk22(int risk22) {
        this.risk22 = risk22;
    }

    public int getRisk23() {
        return risk23;
    }

    public void setRisk23(int risk23) {
        this.risk23 = risk23;
    }

    public int getRisk24() {
        return risk24;
    }

    public void setRisk24(int risk24) {
        this.risk24 = risk24;
    }

    public int getRisk25() {
        return risk25;
    }

    public void setRisk25(int risk25) {
        this.risk25 = risk25;
    }

    public int getRisk26() {
        return risk26;
    }

    public void setRisk26(int risk26) {
        this.risk26 = risk26;
    }

    public int getRisk27() {
        return risk27;
    }

    public void setRisk27(int risk27) {
        this.risk27 = risk27;
    }

    public int getRisk28() {
        return risk28;
    }

    public void setRisk28(int risk28) {
        this.risk28 = risk28;
    }

    public int getRisk29() {
        return risk29;
    }

    public void setRisk29(int risk29) {
        this.risk29 = risk29;
    }

    public int getRisk30() {
        return risk30;
    }

    public void setRisk30(int risk30) {
        this.risk30 = risk30;
    }

    public int getRisk31() {
        return risk31;
    }

    public void setRisk31(int risk31) {
        this.risk31 = risk31;
    }

    public int getRisk32() {
        return risk32;
    }

    public void setRisk32(int risk32) {
        this.risk32 = risk32;
    }

    public int getRisk33() {
        return risk33;
    }

    public void setRisk33(int risk33) {
        this.risk33 = risk33;
    }

    public int getRisk34() {
        return risk34;
    }

    public void setRisk34(int risk34) {
        this.risk34 = risk34;
    }

    public int getRisk35() {
        return risk35;
    }

    public void setRisk35(int risk35) {
        this.risk35 = risk35;
    }

    public int getRisk36() {
        return risk36;
    }

    public void setRisk36(int risk36) {
        this.risk36 = risk36;
    }
}
