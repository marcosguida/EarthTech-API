package com.example.plantio.api;

import com.example.plantio.model.Zoneamento;
import com.example.plantio.service.ZoneamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;
import java.util.List;
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
@RestController
@RequestMapping("/api/zoneamento")
public class ZoneamentoController {
    @Autowired
    private ZoneamentoService service;

    @GetMapping
    public Iterable<Zoneamento> get(){
        return service.getZoneamento();
    }


}
