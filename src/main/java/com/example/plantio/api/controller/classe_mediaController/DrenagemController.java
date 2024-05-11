package com.example.plantio.api.controller.classe_mediaController;

import com.example.plantio.api.dto.classe_mediaDTO.DrenagemDTO;
import com.example.plantio.api.model.classe_media.Drenagem;
import com.example.plantio.api.service.classe_mediaService.DrenagemService;
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
@RequestMapping("/api/medias/drenagem")
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class DrenagemController {
    @Autowired
    private DrenagemService service;


    // METODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getDrenagem());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <DrenagemDTO> drenagem = service.getDrenagemById(id);
        return drenagem.isPresent() ? ResponseEntity.ok(drenagem.get()) : ResponseEntity.notFound().build();

    }


    // METODO - POST
    @PostMapping
    public ResponseEntity METODO_post(@RequestBody Drenagem drenagem){

        try{
            DrenagemDTO zo = service.insert(drenagem);
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
    public ResponseEntity METODO_put(@PathVariable("id") Long id, @RequestBody Drenagem drenagem){

        drenagem.setId(id);
        DrenagemDTO zo = service.update(drenagem, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // METODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity METODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
