package com.example.plantio.api.controller;

import com.example.plantio.api.dto.CafeDTO;
import com.example.plantio.api.model.culturas.Cafe;
import com.example.plantio.api.service.CafeService;
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
@RequestMapping("/api/cafe")
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class CafeController {
    @Autowired
    private CafeService service;


    // MÉTODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getCafe());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <CafeDTO> cafe = service.getCafeById(id);
        return cafe.isPresent() ? ResponseEntity.ok(cafe.get()) : ResponseEntity.notFound().build();

    }


    // MÉTODO - POST
    @PostMapping
    public ResponseEntity MÉTODO_post(@RequestBody Cafe cafe){

        try{
            CafeDTO zo = service.insert(cafe);
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
    public ResponseEntity MÉTODO_put(@PathVariable("id") Long id, @RequestBody Cafe cafe){

        cafe.setId(id);
        CafeDTO zo = service.update(cafe, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // MÉTODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity MÉTODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
