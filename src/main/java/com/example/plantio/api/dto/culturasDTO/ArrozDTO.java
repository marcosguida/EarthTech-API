package com.example.plantio.api.dto.culturasDTO;

import com.example.plantio.api.model.culturas.Arroz;
import lombok.Data;

/**
 * @author marcos
 */

@Data
public class ArrozDTO {
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

    public ArrozDTO(Arroz arroz) {
        this.id = arroz.getId();
        this.safra = arroz.getSafra();
        this.cultura = arroz.getCultura();
        this.uf = arroz.getUf();
        this.municipio = arroz.getMunicipio();
        this.grupo = arroz.getGrupo();
        this.solo = arroz.getSolo();
        this.risk1 = arroz.getRisk1();
        this.risk2 = arroz.getRisk2();
        this.risk3 = arroz.getRisk3();
        this.risk4 = arroz.getRisk4();
        this.risk5 = arroz.getRisk5();
        this.risk6 = arroz.getRisk6();
        this.risk7 = arroz.getRisk7();
        this.risk8 = arroz.getRisk8();
        this.risk9 = arroz.getRisk9();
        this.risk10 = arroz.getRisk10();
        this.risk11 = arroz.getRisk11();
        this.risk12 = arroz.getRisk12();
        this.risk13 = arroz.getRisk13();
        this.risk14 = arroz.getRisk14();
        this.risk15 = arroz.getRisk15();
        this.risk16 = arroz.getRisk16();
        this.risk17 = arroz.getRisk17();
        this.risk18 = arroz.getRisk18();
        this.risk19 = arroz.getRisk19();
        this.risk20 = arroz.getRisk20();
        this.risk21 = arroz.getRisk21();
        this.risk22 = arroz.getRisk22();
        this.risk23 = arroz.getRisk23();
        this.risk24 = arroz.getRisk24();
        this.risk25 = arroz.getRisk25();
        this.risk26 = arroz.getRisk26();
        this.risk27 = arroz.getRisk27();
        this.risk28 = arroz.getRisk28();
        this.risk29 = arroz.getRisk29();
        this.risk30 = arroz.getRisk30();
        this.risk31 = arroz.getRisk31();
        this.risk32 = arroz.getRisk32();
        this.risk33 = arroz.getRisk33();
        this.risk34 = arroz.getRisk34();
        this.risk35 = arroz.getRisk35();
        this.risk36 = arroz.getRisk36();
    }

    public static ArrozDTO create(Arroz arroz) {
        return new ArrozDTO(arroz);
    }
}
