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
    private String safra;
    private String cultura;
    private String uf;
    private String municipio;
    private String grupo;
    private String solo;
    private Long risk1, risk2, risk3, risk4, risk5, risk6, risk7, risk8, risk9, risk10;
    private Long risk11, risk12, risk13, risk14, risk15, risk16, risk17, risk18, risk19;
    private Long risk20, risk21, risk22, risk23, risk24, risk25, risk26, risk27, risk28, risk29;
    private Long risk30, risk31, risk32, risk33, risk34, risk35, risk36;

    public Zoneamento(Long id, String safra, String cultura, String uf, String municipio, String grupo, String solo, Long risk1, Long risk2, Long risk3, Long risk4, Long risk5, Long risk6, Long risk7, Long risk8, Long risk9, Long risk10, Long risk11, Long risk12, Long risk13, Long risk14, Long risk15, Long risk16, Long risk17, Long risk18, Long risk19, Long risk20, Long risk21, Long risk22, Long risk23, Long risk24, Long risk25, Long risk26, Long risk27, Long risk28, Long risk29, Long risk30, Long risk31, Long risk32, Long risk33, Long risk34, Long risk35, Long risk36) {

        this.id = id;
        this.safra = safra;
        this.cultura = cultura;
        this.uf = uf;
        this.municipio = municipio;
        this.grupo = grupo;
        this.solo = solo;
        this.risk1 = risk1; this.risk2 = risk2;
        this.risk3 = risk3; this.risk4 = risk4;
        this.risk5 = risk5; this.risk6 = risk6;
        this.risk7 = risk7; this.risk8 = risk8;
        this.risk9 = risk9; this.risk10 = risk10;
        this.risk11 = risk11; this.risk12 = risk12;
        this.risk13 = risk13; this.risk14 = risk14;
        this.risk15 = risk15; this.risk16 = risk16;
        this.risk17 = risk17; this.risk18 = risk18;
        this.risk19 = risk19; this.risk20 = risk20;
        this.risk21 = risk21; this.risk22 = risk22;
        this.risk23 = risk23; this.risk24 = risk24;
        this.risk25 = risk25; this.risk26 = risk26;
        this.risk27 = risk27; this.risk28 = risk28;
        this.risk29 = risk29; this.risk30 = risk30;
        this.risk31 = risk31; this.risk32 = risk32;
        this.risk33 = risk33; this.risk34 = risk34;
        this.risk35 = risk35; this.risk36 = risk36;
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

    public Long getRisk1() {
        return risk1;
    }

    public void setRisk1(Long risk1) {
        this.risk1 = risk1;
    }

    public Long getRisk2() {
        return risk2;
    }

    public void setRisk2(Long risk2) {
        this.risk2 = risk2;
    }

    public Long getRisk3() {
        return risk3;
    }

    public void setRisk3(Long risk3) {
        this.risk3 = risk3;
    }

    public Long getRisk4() {
        return risk4;
    }

    public void setRisk4(Long risk4) {
        this.risk4 = risk4;
    }

    public Long getRisk5() {
        return risk5;
    }

    public void setRisk5(Long risk5) {
        this.risk5 = risk5;
    }

    public Long getRisk6() {
        return risk6;
    }

    public void setRisk6(Long risk6) {
        this.risk6 = risk6;
    }

    public Long getRisk7() {
        return risk7;
    }

    public void setRisk7(Long risk7) {
        this.risk7 = risk7;
    }

    public Long getRisk8() {
        return risk8;
    }

    public void setRisk8(Long risk8) {
        this.risk8 = risk8;
    }

    public Long getRisk9() {
        return risk9;
    }

    public void setRisk9(Long risk9) {
        this.risk9 = risk9;
    }

    public Long getRisk10() {
        return risk10;
    }

    public void setRisk10(Long risk10) {
        this.risk10 = risk10;
    }

    public Long getRisk11() {
        return risk11;
    }

    public void setRisk11(Long risk11) {
        this.risk11 = risk11;
    }

    public Long getRisk12() {
        return risk12;
    }

    public void setRisk12(Long risk12) {
        this.risk12 = risk12;
    }

    public Long getRisk13() {
        return risk13;
    }

    public void setRisk13(Long risk13) {
        this.risk13 = risk13;
    }

    public Long getRisk14() {
        return risk14;
    }

    public void setRisk14(Long risk14) {
        this.risk14 = risk14;
    }

    public Long getRisk15() {
        return risk15;
    }

    public void setRisk15(Long risk15) {
        this.risk15 = risk15;
    }

    public Long getRisk16() {
        return risk16;
    }

    public void setRisk16(Long risk16) {
        this.risk16 = risk16;
    }

    public Long getRisk17() {
        return risk17;
    }

    public void setRisk17(Long risk17) {
        this.risk17 = risk17;
    }

    public Long getRisk18() {
        return risk18;
    }

    public void setRisk18(Long risk18) {
        this.risk18 = risk18;
    }

    public Long getRisk19() {
        return risk19;
    }

    public void setRisk19(Long risk19) {
        this.risk19 = risk19;
    }

    public Long getRisk20() {
        return risk20;
    }

    public void setRisk20(Long risk20) {
        this.risk20 = risk20;
    }

    public Long getRisk21() {
        return risk21;
    }

    public void setRisk21(Long risk21) {
        this.risk21 = risk21;
    }

    public Long getRisk22() {
        return risk22;
    }

    public void setRisk22(Long risk22) {
        this.risk22 = risk22;
    }

    public Long getRisk23() {
        return risk23;
    }

    public void setRisk23(Long risk23) {
        this.risk23 = risk23;
    }

    public Long getRisk24() {
        return risk24;
    }

    public void setRisk24(Long risk24) {
        this.risk24 = risk24;
    }

    public Long getRisk25() {
        return risk25;
    }

    public void setRisk25(Long risk25) {
        this.risk25 = risk25;
    }

    public Long getRisk26() {
        return risk26;
    }

    public void setRisk26(Long risk26) {
        this.risk26 = risk26;
    }

    public Long getRisk27() {
        return risk27;
    }

    public void setRisk27(Long risk27) {
        this.risk27 = risk27;
    }

    public Long getRisk28() {
        return risk28;
    }

    public void setRisk28(Long risk28) {
        this.risk28 = risk28;
    }

    public Long getRisk29() {
        return risk29;
    }

    public void setRisk29(Long risk29) {
        this.risk29 = risk29;
    }

    public Long getRisk30() {
        return risk30;
    }

    public void setRisk30(Long risk30) {
        this.risk30 = risk30;
    }

    public Long getRisk31() {
        return risk31;
    }

    public void setRisk31(Long risk31) {
        this.risk31 = risk31;
    }

    public Long getRisk32() {
        return risk32;
    }

    public void setRisk32(Long risk32) {
        this.risk32 = risk32;
    }

    public Long getRisk33() {
        return risk33;
    }

    public void setRisk33(Long risk33) {
        this.risk33 = risk33;
    }

    public Long getRisk34() {
        return risk34;
    }

    public void setRisk34(Long risk34) {
        this.risk34 = risk34;
    }

    public Long getRisk35() {
        return risk35;
    }

    public void setRisk35(Long risk35) {
        this.risk35 = risk35;
    }

    public Long getRisk36() {
        return risk36;
    }

    public void setRisk36(Long risk36) {
        this.risk36 = risk36;
    }
}
