package com.example.plantio.api.dto;

import com.example.plantio.api.model.Zoneamento;
import lombok.Data;

@Data
public class ZoneamentoDTO {
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

    public ZoneamentoDTO(Zoneamento zoneamento) {
        this.id = zoneamento.getId();
        this.safra = zoneamento.getSafra();
        this.cultura = zoneamento.getCultura();
        this.uf = zoneamento.getUf();
        this.municipio = zoneamento.getMunicipio();
        this.grupo = zoneamento.getGrupo();
        this.solo = zoneamento.getSolo();
        this.risk1 = zoneamento.getRisk1();
        this.risk2 = zoneamento.getRisk2();
        this.risk3 = zoneamento.getRisk3();
        this.risk4 = zoneamento.getRisk4();
        this.risk5 = zoneamento.getRisk5();
        this.risk6 = zoneamento.getRisk6();
        this.risk7 = zoneamento.getRisk7();
        this.risk8 = zoneamento.getRisk8();
        this.risk9 = zoneamento.getRisk9();
        this.risk10 = zoneamento.getRisk10();
        this.risk11 = zoneamento.getRisk11();
        this.risk12 = zoneamento.getRisk12();
        this.risk13 = zoneamento.getRisk13();
        this.risk14 = zoneamento.getRisk14();
        this.risk15 = zoneamento.getRisk15();
        this.risk16 = zoneamento.getRisk16();
        this.risk17 = zoneamento.getRisk17();
        this.risk18 = zoneamento.getRisk18();
        this.risk19 = zoneamento.getRisk19();
        this.risk20 = zoneamento.getRisk20();
        this.risk21 = zoneamento.getRisk21();
        this.risk22 = zoneamento.getRisk22();
        this.risk23 = zoneamento.getRisk23();
        this.risk24 = zoneamento.getRisk24();
        this.risk25 = zoneamento.getRisk25();
        this.risk26 = zoneamento.getRisk26();
        this.risk27 = zoneamento.getRisk27();
        this.risk28 = zoneamento.getRisk28();
        this.risk29 = zoneamento.getRisk29();
        this.risk30 = zoneamento.getRisk30();
        this.risk31 = zoneamento.getRisk31();
        this.risk32 = zoneamento.getRisk32();
        this.risk33 = zoneamento.getRisk33();
        this.risk34 = zoneamento.getRisk34();
        this.risk35 = zoneamento.getRisk35();
        this.risk36 = zoneamento.getRisk36();
    }

    public static ZoneamentoDTO create(Zoneamento zoneamento) {
        return new ZoneamentoDTO(zoneamento);
    }
}
