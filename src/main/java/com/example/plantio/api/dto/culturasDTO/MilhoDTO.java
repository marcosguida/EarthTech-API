package com.example.plantio.api.dto.culturasDTO;

import com.example.plantio.api.model.culturas.Milho;
import lombok.Data;

@Data
public class MilhoDTO {
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

    public MilhoDTO(Milho milho) {
        this.id = milho.getId();
        this.safra = milho.getSafra();
        this.cultura = milho.getCultura();
        this.uf = milho.getUf();
        this.municipio = milho.getMunicipio();
        this.grupo = milho.getGrupo();
        this.solo = milho.getSolo();
        this.risk1 = milho.getRisk1();
        this.risk2 = milho.getRisk2();
        this.risk3 = milho.getRisk3();
        this.risk4 = milho.getRisk4();
        this.risk5 = milho.getRisk5();
        this.risk6 = milho.getRisk6();
        this.risk7 = milho.getRisk7();
        this.risk8 = milho.getRisk8();
        this.risk9 = milho.getRisk9();
        this.risk10 = milho.getRisk10();
        this.risk11 = milho.getRisk11();
        this.risk12 = milho.getRisk12();
        this.risk13 = milho.getRisk13();
        this.risk14 = milho.getRisk14();
        this.risk15 = milho.getRisk15();
        this.risk16 = milho.getRisk16();
        this.risk17 = milho.getRisk17();
        this.risk18 = milho.getRisk18();
        this.risk19 = milho.getRisk19();
        this.risk20 = milho.getRisk20();
        this.risk21 = milho.getRisk21();
        this.risk22 = milho.getRisk22();
        this.risk23 = milho.getRisk23();
        this.risk24 = milho.getRisk24();
        this.risk25 = milho.getRisk25();
        this.risk26 = milho.getRisk26();
        this.risk27 = milho.getRisk27();
        this.risk28 = milho.getRisk28();
        this.risk29 = milho.getRisk29();
        this.risk30 = milho.getRisk30();
        this.risk31 = milho.getRisk31();
        this.risk32 = milho.getRisk32();
        this.risk33 = milho.getRisk33();
        this.risk34 = milho.getRisk34();
        this.risk35 = milho.getRisk35();
        this.risk36 = milho.getRisk36();
    }

    public static MilhoDTO create(Milho milho) {
        return new MilhoDTO(milho);
    }
}
