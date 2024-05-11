package com.example.plantio.api.dto.culturasDTO;

import com.example.plantio.api.model.culturas.Soja;
import lombok.Data;

/**
 * @author marcos
 */

@Data
public class SojaDTO {
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

    public SojaDTO(Soja soja) {
        this.id = soja.getId();
        this.safra = soja.getSafra();
        this.cultura = soja.getCultura();
        this.uf = soja.getUf();
        this.municipio = soja.getMunicipio();
        this.grupo = soja.getGrupo();
        this.solo = soja.getSolo();
        this.risk1 = soja.getRisk1();
        this.risk2 = soja.getRisk2();
        this.risk3 = soja.getRisk3();
        this.risk4 = soja.getRisk4();
        this.risk5 = soja.getRisk5();
        this.risk6 = soja.getRisk6();
        this.risk7 = soja.getRisk7();
        this.risk8 = soja.getRisk8();
        this.risk9 = soja.getRisk9();
        this.risk10 = soja.getRisk10();
        this.risk11 = soja.getRisk11();
        this.risk12 = soja.getRisk12();
        this.risk13 = soja.getRisk13();
        this.risk14 = soja.getRisk14();
        this.risk15 = soja.getRisk15();
        this.risk16 = soja.getRisk16();
        this.risk17 = soja.getRisk17();
        this.risk18 = soja.getRisk18();
        this.risk19 = soja.getRisk19();
        this.risk20 = soja.getRisk20();
        this.risk21 = soja.getRisk21();
        this.risk22 = soja.getRisk22();
        this.risk23 = soja.getRisk23();
        this.risk24 = soja.getRisk24();
        this.risk25 = soja.getRisk25();
        this.risk26 = soja.getRisk26();
        this.risk27 = soja.getRisk27();
        this.risk28 = soja.getRisk28();
        this.risk29 = soja.getRisk29();
        this.risk30 = soja.getRisk30();
        this.risk31 = soja.getRisk31();
        this.risk32 = soja.getRisk32();
        this.risk33 = soja.getRisk33();
        this.risk34 = soja.getRisk34();
        this.risk35 = soja.getRisk35();
        this.risk36 = soja.getRisk36();
    }

    public static SojaDTO create(Soja soja) {
        return new SojaDTO(soja);
    }
}
