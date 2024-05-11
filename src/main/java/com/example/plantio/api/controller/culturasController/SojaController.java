package com.example.plantio.api.controller.culturasController;

import com.example.plantio.api.dto.culturasDTO.SojaDTO;
import com.example.plantio.api.model.culturas.Soja;
import com.example.plantio.api.service.culturasService.SojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.Optional;

/**
 * @author marcos
 */

@RestController
@RequestMapping("/api/soja")
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class SojaController {
    @Autowired
    private SojaService service;


    // METODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getSoja());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <SojaDTO> soja = service.getSojaById(id);
        return soja.isPresent() ? ResponseEntity.ok(soja.get()) : ResponseEntity.notFound().build();

    }


    // METODO - POST
    @PostMapping
    public ResponseEntity METODO_post(@RequestBody Soja soja){

        try{
            SojaDTO zo = service.insert(soja);
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


    // METODO - PUT
    @PutMapping("/{id}")
    public ResponseEntity METODO_put(@PathVariable("id") Long id, @RequestBody Soja soja){

        soja.setId(id);
        SojaDTO zo = service.update(soja, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // METODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity METODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
