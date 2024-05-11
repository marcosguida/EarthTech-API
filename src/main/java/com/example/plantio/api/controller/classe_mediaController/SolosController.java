package com.example.plantio.api.controller.classe_mediaController;

import com.example.plantio.api.dto.classe_mediaDTO.SolosDTO;
import com.example.plantio.api.model.classe_media.Solos;
import com.example.plantio.api.service.classe_mediaService.SolosService;
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
@RequestMapping("/api/medias/solos")
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class SolosController {
    @Autowired
    private SolosService service;


    // MÉTODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getSolos());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <SolosDTO> solos = service.getSolosById(id);
        return solos.isPresent() ? ResponseEntity.ok(solos.get()) : ResponseEntity.notFound().build();

    }

    @GetMapping("/phAgua/{phAgua}")
    public ResponseEntity getSolosByPhAgua(@PathVariable("phAgua") Double phAgua){
        List<SolosDTO> medias = service.getSolosByPhAgua(phAgua);
        return medias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(medias);
    }

    @GetMapping("/fosforo/{fosforo}")
    public ResponseEntity getSolosByFosforo(@PathVariable("fosforo") Double fosforo){
        List<SolosDTO> medias = service.getSolosByFosforo(fosforo);
        return medias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(medias);
    }

    @GetMapping("/fosforoAssimilavel/{fosforoAssimilavel}")
    public ResponseEntity getSolosByFosforoAssimilavel(@PathVariable("fosforoAssimilavel") Double fosforoAssimilavel){
        List<SolosDTO> medias = service.getSolosByFosforoAssimilavel(fosforoAssimilavel);
        return medias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(medias);
    }

    @GetMapping("/carbono/{carbono}")
    public ResponseEntity getSolosByCarbono(@PathVariable("carbono") Double carbono){
        List<SolosDTO> medias = service.getSolosByCarbono(carbono);
        return medias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(medias);
    }

    @GetMapping("/nitrogenio/{nitrogenio}")
    public ResponseEntity getSolosByNitrogenio(@PathVariable("nitrogenio") Double nitrogenio){
        List<SolosDTO> medias = service.getSolosByNitrogenio(nitrogenio);
        return medias.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(medias);
    }

    // MÉTODO - POST
    @PostMapping
    public ResponseEntity MÉTODO_post(@RequestBody Solos solos){

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


    // MÉTODO - PUT
    @PutMapping("/{id}")
    public ResponseEntity MÉTODO_put(@PathVariable("id") Long id, @RequestBody Solos solos){

        solos.setId(id);
        SolosDTO zo = service.update(solos, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // MÉTODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity MÉTODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
