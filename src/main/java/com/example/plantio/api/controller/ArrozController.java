package com.example.plantio.api.controller;

import com.example.plantio.api.dto.ArrozDTO;
import com.example.plantio.api.model.culturas.Arroz;
import com.example.plantio.api.service.ArrozService;
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
@RequestMapping("/api/arroz")
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class ArrozController {
    @Autowired
    private ArrozService service;


    // MÉTODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getArroz());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <ArrozDTO> arroz = service.getArrozById(id);
        return arroz.isPresent() ? ResponseEntity.ok(arroz.get()) : ResponseEntity.notFound().build();

    }


    // MÉTODO - POST
    @PostMapping
    public ResponseEntity MÉTODO_post(@RequestBody Arroz arroz){

        try{
            ArrozDTO zo = service.insert(arroz);
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
    public ResponseEntity MÉTODO_put(@PathVariable("id") Long id, @RequestBody Arroz arroz){

        arroz.setId(id);
        ArrozDTO zo = service.update(arroz, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // MÉTODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity MÉTODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
