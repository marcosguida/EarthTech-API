package com.example.plantio.api.controller.classe_mediaController;

import com.example.plantio.api.dto.classe_mediaDTO.SolosDTO;
import com.example.plantio.api.model.classe_media.Solos;
import com.example.plantio.api.service.classe_mediaService.SolosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.Optional;

/**
 * @author marcos
 */

@RestController
@RequestMapping("/api/medias/solos")
public class SolosController {
    @Autowired
    private SolosService service;


    // METODO - GET
    @GetMapping()
    public ResponseEntity<?> get(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Long id){
        Optional<SolosDTO> solos = service.getById(id);
        return solos.isPresent() ? ResponseEntity.ok(solos.get()) : ResponseEntity.notFound().build();
    }

    // METODO - POST
    @PostMapping
    public ResponseEntity<?> METODO_post(@RequestBody Solos solos){

        try{
            SolosDTO zo = service.insert(solos);
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
    public ResponseEntity<?> METODO_put(@PathVariable("id") Long id, @RequestBody Solos solos){

        solos.setId(id);
        SolosDTO zo = service.update(solos, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // METODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<?> METODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
