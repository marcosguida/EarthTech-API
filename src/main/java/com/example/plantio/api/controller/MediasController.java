package com.example.plantio.api.controller;

import com.example.plantio.api.dto.MediasDTO;
import com.example.plantio.api.model.Medias;
import com.example.plantio.api.service.MediasService;
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
@RequestMapping("/api/medias")
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class MediasController {
    @Autowired
    private MediasService service;


    // METODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getMedias());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <MediasDTO> medias = service.getMediasById(id);
        return medias.isPresent() ? ResponseEntity.ok(medias.get()) : ResponseEntity.notFound().build();

    }

    @GetMapping("/classe/{classe}")
    public ResponseEntity getMediasByClasse(@PathVariable("classe") String classe){
        List<MediasDTO> medias = service.getMediasByClasse(classe);
        return medias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(medias);
    }

    @GetMapping("/areia/{areia}")
    public ResponseEntity getMediasByAreia(@PathVariable("areia") Double areia){
        List<MediasDTO> medias = service.getMediasByAreia(areia);
        return medias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(medias);
    }

    @GetMapping("/argila/{argila}")
    public ResponseEntity getMediasByArgila(@PathVariable("argila") Double argila){
        List<MediasDTO> medias = service.getMediasByArgila(argila);
        return medias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(medias);
    }

    @GetMapping("/silte/{silte}")
    public ResponseEntity getMediasBySilte(@PathVariable("silte") Double silte){
        List<MediasDTO> medias = service.getMediasBySilte(silte);
        return medias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(medias);
    }
    
    // METODO - POST
    @PostMapping
    public ResponseEntity METODO_post(@RequestBody Medias medias){

        try{
            MediasDTO zo = service.insert(medias);
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
    public ResponseEntity METODO_put(@PathVariable("id") Long id, @RequestBody Medias medias){

        medias.setId(id);
        MediasDTO zo = service.update(medias, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // METODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity METODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
