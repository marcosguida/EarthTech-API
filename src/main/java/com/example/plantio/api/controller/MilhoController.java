package com.example.plantio.api.controller;

import com.example.plantio.api.dto.MilhoDTO;
import com.example.plantio.api.model.culturas.Milho;
import com.example.plantio.api.service.MilhoService;
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
@RequestMapping("/api/milho")
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class MilhoController {
    @Autowired
    private MilhoService service;


    // MÉTODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getMilho());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <MilhoDTO> milho = service.getMilhoById(id);
        return milho.isPresent() ? ResponseEntity.ok(milho.get()) : ResponseEntity.notFound().build();

    }


    // MÉTODO - POST
    @PostMapping
    public ResponseEntity MÉTODO_post(@RequestBody Milho milho){

        try{
            MilhoDTO zo = service.insert(milho);
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
    public ResponseEntity MÉTODO_put(@PathVariable("id") Long id, @RequestBody Milho milho){

        milho.setId(id);
        MilhoDTO zo = service.update(milho, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // MÉTODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity MÉTODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
