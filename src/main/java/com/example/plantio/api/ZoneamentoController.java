package com.example.plantio.api;

import com.example.plantio.model.Zoneamento;
import com.example.plantio.service.Zoneamentoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/zoneamento")
public class ZoneamentoController {
    @Autowired
    private Zoneamentoservice service;

    @GetMapping
    public List<Zoneamento> get(){
        return service.getZoneamento();
    }


}
