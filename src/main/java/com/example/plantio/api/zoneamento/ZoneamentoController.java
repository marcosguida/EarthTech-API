package com.example.plantio.api.zoneamento;

import com.example.plantio.api.model.Zoneamento;
import com.example.plantio.api.service.ZoneamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

/**
 * @author marcos
 */

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

    @GetMapping("/{id}")
    public Optional<Zoneamento> get(@PathVariable("id") Long id){
        return service.getZoneamentoById(id);
    }

    @GetMapping("/safra/{safra}")
    public Iterable<Zoneamento> getZoneamentoBySafra(@PathVariable("safra") String safra){
        return service.getZoneamentoBySafra(safra);
    }

    @GetMapping("/cultura/{cultura}")
    public Iterable<Zoneamento> getZoneamentoByCultura(@PathVariable("cultura") String cultura){
        return service.getZoneamentoByCultura(cultura);
    }

    @GetMapping("/municipio/{municipio}")
    public Iterable<Zoneamento> getZoneamentoByMunicipio(@PathVariable("municipio") String municipio){
        return service.getZoneamentoByMunicipio(municipio);
    }

    @GetMapping("/microrrregiao/{microrrregiao}")
    public Iterable<Zoneamento> getZoneamentoByMicrorrregiao(@PathVariable("microrrregiao") String microrrregiao){
        return service.getZoneamentoByMicrorrregiao(microrrregiao);
    }

    @GetMapping("/solo/{solo}")
    public Iterable<Zoneamento> getZoneamentoBySolo(@PathVariable("solo") String solo){
        return service.getZoneamentoBySolo(solo);
    }

    @PostMapping
    public String method_post(@RequestBody Zoneamento zoneamento){
        Zoneamento zo = service.insert(zoneamento);
        return "Informaçẽos de zonemanento salvas com sucesso! ID: " + zo.getId();
    }

    @PutMapping("/{id}")
    public String method_put(@PathVariable("id") Long id, @RequestBody Zoneamento zoneamento){
        Zoneamento zo = service.update(zoneamento, id);
        return "Informações de zoneamento atualizadas com sucesso! ID: " + zo.getId();
    }

    @DeleteMapping("/{id}")
    public String method_delete(@PathVariable("id") Long id){
        service.delete(id);
        return "Zonemanento deletado com sucesso!";
    }

}
