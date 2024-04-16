package com.example.plantio.api;

import com.example.plantio.model.Zoneamento;
import com.example.plantio.service.Zoneamentoservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/zoneamento")
public class ZoneamentoController {
    private Zoneamentoservice service = new Zoneamentoservice();

    @GetMapping
    public List<Zoneamento> get(){
        return service.getZoneamento();
    }


}
