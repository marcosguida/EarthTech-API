package com.example.plantio.service;

import com.example.plantio.model.Zoneamento;
import com.example.plantio.repository.ZoneamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class ZoneamentoService {

    @Autowired
    private ZoneamentoRepository rep;

    public Iterable<Zoneamento> getZoneamento() {
        return rep.findAll();
    }

    public List<Zoneamento> getZoneamentoList(){
        List<Zoneamento> zoneamentos = new ArrayList<>();
        return zoneamentos;
    }
}
