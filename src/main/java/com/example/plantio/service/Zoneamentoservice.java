package com.example.plantio.service;

import com.example.plantio.model.Zoneamento;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Zoneamentoservice {

    public List<Zoneamento> getZoneamento(){
        List<Zoneamento> zoneamentos = new ArrayList<>();
        return zoneamentos;
    }
}
