package com.example.plantio.api.zoneamento;

import com.example.plantio.api.dto.ZoneamentoDTO;
import com.example.plantio.api.model.Zoneamento;
import com.example.plantio.api.service.ZoneamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    public ResponseEntity<List<ZoneamentoDTO>> getZoneamentoByMicrorrregiao(@PathVariable("microrrregiao") String microrrregiao){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByMicrorrregiao(microrrregiao);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/solo/{solo}")
    public ResponseEntity<List<ZoneamentoDTO>> getZoneamentoBySolo(@PathVariable("solo") String solo){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoBySolo(solo);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }


    // MÉTODO - POST
    @PostMapping
    public String MÉTODO_post(@RequestBody Zoneamento zoneamento){
        Zoneamento zo = service.insert(zoneamento);
        return "Informaçẽos de zonemanento salvas com sucesso! ID: " + zo.getId() + ResponseEntity.status(HttpStatus.CREATED).body(zo);
    }

    // MÉTODO - PUT
    @PutMapping("/{id}")
    public String MÉTODO_put(@PathVariable("id") Long id, @RequestBody Zoneamento zoneamento){
        Zoneamento zo = service.update(zoneamento, id);
        return "Informações de zoneamento atualizadas com sucesso! ID: " + zo.getId();
    }

    // MÉTODO - DELETE
    @DeleteMapping("/{id}")
    public String MÉTODO_delete(@PathVariable("id") Long id){
        service.delete(id);
        return "Zonemanento deletado com sucesso!";
    }

}
