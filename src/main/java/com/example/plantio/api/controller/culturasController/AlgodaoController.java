package com.example.plantio.api.controller.culturasController;

import com.example.plantio.api.dto.culturasDTO.AlgodaoDTO;
import com.example.plantio.api.model.culturas.Algodao;
import com.example.plantio.api.service.culturasService.AlgodaoService;
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
@RequestMapping("/api/algodao")
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class AlgodaoController {
    @Autowired
    private AlgodaoService service;


    // METODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getAlgodao());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <AlgodaoDTO> algodao = service.getAlgodaoById(id);
        return algodao.isPresent() ? ResponseEntity.ok(algodao.get()) : ResponseEntity.notFound().build();

    }


    // METODO - POST
    @PostMapping
    public ResponseEntity METODO_post(@RequestBody Algodao algodao){

        try{
            AlgodaoDTO zo = service.insert(algodao);
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
    public ResponseEntity METODO_put(@PathVariable("id") Long id, @RequestBody Algodao algodao){

        algodao.setId(id);
        AlgodaoDTO zo = service.update(algodao, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // METODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity METODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
