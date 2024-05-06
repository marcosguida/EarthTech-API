package com.example.plantio.api.dto;

import com.example.plantio.api.model.Zoneamento;
import lombok.Data;

@Data
public class ZoneamentoDTO {
    private Long id;
    private String safra;
    private String cultura;
    private String descricao;
    private String municipio;
    private String microrregiao;
    private String solo;

    public ZoneamentoDTO(Zoneamento zoneamento) {
        this.id = zoneamento.getId();
        this.safra = zoneamento.getSafra();
        this.cultura = zoneamento.getCultura();
        this.descricao = zoneamento.getDescricao();
        this.municipio = zoneamento.getMunicipio();
        this.microrregiao = zoneamento.getMicrorregiao();
        this.solo = zoneamento.getSolo();
    }

    public static ZoneamentoDTO create(Zoneamento zoneamento) {
        return new ZoneamentoDTO(zoneamento);
    }
}
