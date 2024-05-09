package com.example.plantio.api.dto.culturasDTO;

import com.example.plantio.api.model.culturas.Feijao;
import lombok.Data;

@Data
public class FeijaoDTO {
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

    public FeijaoDTO(Feijao feijao) {
        this.id = feijao.getId();
        this.safra = feijao.getSafra();
        this.cultura = feijao.getCultura();
        this.uf = feijao.getUf();
        this.municipio = feijao.getMunicipio();
        this.grupo = feijao.getGrupo();
        this.solo = feijao.getSolo();
        this.risk1 = feijao.getRisk1();
        this.risk2 = feijao.getRisk2();
        this.risk3 = feijao.getRisk3();
        this.risk4 = feijao.getRisk4();
        this.risk5 = feijao.getRisk5();
        this.risk6 = feijao.getRisk6();
        this.risk7 = feijao.getRisk7();
        this.risk8 = feijao.getRisk8();
        this.risk9 = feijao.getRisk9();
        this.risk10 = feijao.getRisk10();
        this.risk11 = feijao.getRisk11();
        this.risk12 = feijao.getRisk12();
        this.risk13 = feijao.getRisk13();
        this.risk14 = feijao.getRisk14();
        this.risk15 = feijao.getRisk15();
        this.risk16 = feijao.getRisk16();
        this.risk17 = feijao.getRisk17();
        this.risk18 = feijao.getRisk18();
        this.risk19 = feijao.getRisk19();
        this.risk20 = feijao.getRisk20();
        this.risk21 = feijao.getRisk21();
        this.risk22 = feijao.getRisk22();
        this.risk23 = feijao.getRisk23();
        this.risk24 = feijao.getRisk24();
        this.risk25 = feijao.getRisk25();
        this.risk26 = feijao.getRisk26();
        this.risk27 = feijao.getRisk27();
        this.risk28 = feijao.getRisk28();
        this.risk29 = feijao.getRisk29();
        this.risk30 = feijao.getRisk30();
        this.risk31 = feijao.getRisk31();
        this.risk32 = feijao.getRisk32();
        this.risk33 = feijao.getRisk33();
        this.risk34 = feijao.getRisk34();
        this.risk35 = feijao.getRisk35();
        this.risk36 = feijao.getRisk36();
    }

    public static FeijaoDTO create(Feijao feijao) {
        return new FeijaoDTO(feijao);
    }
}
