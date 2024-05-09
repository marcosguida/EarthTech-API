package com.example.plantio.api.dto.culturasDTO;

import com.example.plantio.api.model.culturas.Algodao;
import lombok.Data;

@Data
public class AlgodaoDTO {
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

    public AlgodaoDTO(Algodao algodao) {
        this.id = algodao.getId();
        this.safra = algodao.getSafra();
        this.cultura = algodao.getCultura();
        this.uf = algodao.getUf();
        this.municipio = algodao.getMunicipio();
        this.grupo = algodao.getGrupo();
        this.solo = algodao.getSolo();
        this.risk1 = algodao.getRisk1();
        this.risk2 = algodao.getRisk2();
        this.risk3 = algodao.getRisk3();
        this.risk4 = algodao.getRisk4();
        this.risk5 = algodao.getRisk5();
        this.risk6 = algodao.getRisk6();
        this.risk7 = algodao.getRisk7();
        this.risk8 = algodao.getRisk8();
        this.risk9 = algodao.getRisk9();
        this.risk10 = algodao.getRisk10();
        this.risk11 = algodao.getRisk11();
        this.risk12 = algodao.getRisk12();
        this.risk13 = algodao.getRisk13();
        this.risk14 = algodao.getRisk14();
        this.risk15 = algodao.getRisk15();
        this.risk16 = algodao.getRisk16();
        this.risk17 = algodao.getRisk17();
        this.risk18 = algodao.getRisk18();
        this.risk19 = algodao.getRisk19();
        this.risk20 = algodao.getRisk20();
        this.risk21 = algodao.getRisk21();
        this.risk22 = algodao.getRisk22();
        this.risk23 = algodao.getRisk23();
        this.risk24 = algodao.getRisk24();
        this.risk25 = algodao.getRisk25();
        this.risk26 = algodao.getRisk26();
        this.risk27 = algodao.getRisk27();
        this.risk28 = algodao.getRisk28();
        this.risk29 = algodao.getRisk29();
        this.risk30 = algodao.getRisk30();
        this.risk31 = algodao.getRisk31();
        this.risk32 = algodao.getRisk32();
        this.risk33 = algodao.getRisk33();
        this.risk34 = algodao.getRisk34();
        this.risk35 = algodao.getRisk35();
        this.risk36 = algodao.getRisk36();
    }

    public static AlgodaoDTO create(Algodao algodao) {
        return new AlgodaoDTO(algodao);
    }
}
