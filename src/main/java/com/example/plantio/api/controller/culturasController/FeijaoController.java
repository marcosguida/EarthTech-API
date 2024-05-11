package com.example.plantio.api.controller.culturasController;

import com.example.plantio.api.dto.culturasDTO.FeijaoDTO;
import com.example.plantio.api.model.culturas.Feijao;
import com.example.plantio.api.service.culturasService.FeijaoService;
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
@RequestMapping("/api/feijao")
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class FeijaoController {
    @Autowired
    private FeijaoService service;


    // METODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getFeijao());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <FeijaoDTO> feijao = service.getFeijaoById(id);
        return feijao.isPresent() ? ResponseEntity.ok(feijao.get()) : ResponseEntity.notFound().build();

    }


    // METODO - POST
    @PostMapping
    public ResponseEntity METODO_post(@RequestBody Feijao feijao){

        try{
            FeijaoDTO zo = service.insert(feijao);
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
    public ResponseEntity METODO_put(@PathVariable("id") Long id, @RequestBody Feijao feijao){

        feijao.setId(id);
        FeijaoDTO zo = service.update(feijao, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // METODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity METODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
