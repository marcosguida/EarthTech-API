package com.example.plantio.api.dto;

import com.example.plantio.api.model.culturas.Cafe;
import lombok.Data;

@Data
public class CafeDTO {
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

    public CafeDTO(Cafe cafe) {
        this.id = cafe.getId();
        this.safra = cafe.getSafra();
        this.cultura = cafe.getCultura();
        this.uf = cafe.getUf();
        this.municipio = cafe.getMunicipio();
        this.grupo = cafe.getGrupo();
        this.solo = cafe.getSolo();
        this.risk1 = cafe.getRisk1();
        this.risk2 = cafe.getRisk2();
        this.risk3 = cafe.getRisk3();
        this.risk4 = cafe.getRisk4();
        this.risk5 = cafe.getRisk5();
        this.risk6 = cafe.getRisk6();
        this.risk7 = cafe.getRisk7();
        this.risk8 = cafe.getRisk8();
        this.risk9 = cafe.getRisk9();
        this.risk10 = cafe.getRisk10();
        this.risk11 = cafe.getRisk11();
        this.risk12 = cafe.getRisk12();
        this.risk13 = cafe.getRisk13();
        this.risk14 = cafe.getRisk14();
        this.risk15 = cafe.getRisk15();
        this.risk16 = cafe.getRisk16();
        this.risk17 = cafe.getRisk17();
        this.risk18 = cafe.getRisk18();
        this.risk19 = cafe.getRisk19();
        this.risk20 = cafe.getRisk20();
        this.risk21 = cafe.getRisk21();
        this.risk22 = cafe.getRisk22();
        this.risk23 = cafe.getRisk23();
        this.risk24 = cafe.getRisk24();
        this.risk25 = cafe.getRisk25();
        this.risk26 = cafe.getRisk26();
        this.risk27 = cafe.getRisk27();
        this.risk28 = cafe.getRisk28();
        this.risk29 = cafe.getRisk29();
        this.risk30 = cafe.getRisk30();
        this.risk31 = cafe.getRisk31();
        this.risk32 = cafe.getRisk32();
        this.risk33 = cafe.getRisk33();
        this.risk34 = cafe.getRisk34();
        this.risk35 = cafe.getRisk35();
        this.risk36 = cafe.getRisk36();
    }

    public static CafeDTO create(Cafe cafe) {
        return new CafeDTO(cafe);
    }
}
