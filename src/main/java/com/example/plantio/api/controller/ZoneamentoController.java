package com.example.plantio.api.controller;

import com.example.plantio.api.dto.ZoneamentoDTO;
import com.example.plantio.api.model.Zoneamento;
import com.example.plantio.api.service.ZoneamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

/**
 * @author marcos
 */

@RestController
@RequestMapping("/api/zoneamento")
public class ZoneamentoController {
    @Autowired
    private ZoneamentoService service;


    // MÉTODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getZoneamento());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <ZoneamentoDTO> zoneamento = service.getZoneamentoById(id);
        return zoneamento.isPresent() ? ResponseEntity.ok(zoneamento.get()) : ResponseEntity.notFound().build();

    }

    @GetMapping("/safra/{safra}")
    public ResponseEntity getZoneamentoBySafra(@PathVariable("safra") String safra){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoBySafra(safra);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/cultura/{cultura}")
    public ResponseEntity getZoneamentoByCultura(@PathVariable("cultura") String cultura){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByCultura(cultura);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/municipio/{municipio}")
    public ResponseEntity getZoneamentoByMunicipio(@PathVariable("municipio") String municipio){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByMunicipio(municipio);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/microrrregiao/{microrrregiao}")
    public ResponseEntity getZoneamentoByMicrorrregiao(@PathVariable("microrrregiao") String microrrregiao){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByMicrorrregiao(microrrregiao);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/solo/{solo}")
    public ResponseEntity getZoneamentoBySolo(@PathVariable("solo") String solo){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoBySolo(solo);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }


    // MÉTODO - POST
    @PostMapping
    public ResponseEntity MÉTODO_post(@RequestBody Zoneamento zoneamento){

        try{
            ZoneamentoDTO zo = service.insert(zoneamento);
            URI location = getUri(zo.getId());
            return ResponseEntity.created(location).build();
        }
        catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }

    private URI getUri(Long id){
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
    }


    // MÉTODO - PUT
    @PutMapping("/{id}")
    public ResponseEntity MÉTODO_put(@PathVariable("id") Long id, @RequestBody Zoneamento zoneamento){

        zoneamento.setId(id);
        ZoneamentoDTO zo = service.update(zoneamento, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // MÉTODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity MÉTODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
