package com.example.plantio.service;

import com.example.plantio.model.Zoneamento;

import java.util.ArrayList;
import java.util.List;

public class Zoneamentoservice {

    public List<Zoneamento> getZoneamento(){
        List<Zoneamento> zoneamentos = new ArrayList<>();

        zoneamentos.add(new Zoneamento(1L, "2023/2024", "Milho", "AD1", "Palmas"));
        zoneamentos.add(new Zoneamento(2L, "2022/2023", "Soja", "AD2", "Paraiso"));
        zoneamentos.add(new Zoneamento(3L, "2021/2022", "Feijão", "AD1", "Porto Nacional"));
        return zoneamentos;
    }
}
