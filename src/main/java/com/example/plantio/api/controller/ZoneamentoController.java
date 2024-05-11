package com.example.plantio.api.controller;

import com.example.plantio.api.dto.ZoneamentoDTO;
import com.example.plantio.api.model.Zoneamento;
import com.example.plantio.api.service.ZoneamentoService;
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
@RequestMapping("/api/zoneamento")
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class ZoneamentoController {
    @Autowired
    private ZoneamentoService service;


    // METODO - GET
    @GetMapping()
    public ResponseEntity get(){
        return ResponseEntity.ok(service.getZoneamento());

    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional <ZoneamentoDTO> zoneamento = service.getZoneamentoById(id);
        return zoneamento.isPresent() ? ResponseEntity.ok(zoneamento.get()) : ResponseEntity.notFound().build();

    }

    @GetMapping("/safra/{safra}")
    public ResponseEntity getZoneamentoBySafra(@PathVariable("safra") String safra){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoBySafra(safra);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/cultura/{cultura}")
    public ResponseEntity getZoneamentoByCultura(@PathVariable("cultura") String cultura){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByCultura(cultura);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/uf/{uf}")
    public ResponseEntity getZoneamentoByUf(@PathVariable("uf") String uf){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByUf(uf);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/municipio/{municipio}")
    public ResponseEntity getZoneamentoByMunicipio(@PathVariable("municipio") String municipio){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByMunicipio(municipio);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/grupo/{grupo}")
    public ResponseEntity getZoneamentoByGrupo(@PathVariable("grupo") String grupo){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByGrupo(grupo);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/solo/{solo}")
    public ResponseEntity getZoneamentoBySolo(@PathVariable("solo") String solo){
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoBySolo(solo);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk1/{risk1}")
    public ResponseEntity getZoneamentoByRisk1(@PathVariable("risk1") Long risk1) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk1(risk1);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk2/{risk2}")
    public ResponseEntity getZoneamentoByRisk2(@PathVariable("risk2") Long risk2) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk2(risk2);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk3/{risk3}")
    public ResponseEntity getZoneamentoByRisk3(@PathVariable("risk3") Long risk3) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk3(risk3);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk4/{risk4}")
    public ResponseEntity getZoneamentoByRisk4(@PathVariable("risk4") Long risk4) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk4(risk4);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk5/{risk5}")
    public ResponseEntity getZoneamentoByRisk5(@PathVariable("risk5") Long risk5) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk5(risk5);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk6/{risk6}")
    public ResponseEntity getZoneamentoByRisk6(@PathVariable("risk6") Long risk6) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk6(risk6);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk7/{risk7}")
    public ResponseEntity getZoneamentoByRisk7(@PathVariable("risk7") Long risk7) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk7(risk7);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk8/{risk8}")
    public ResponseEntity getZoneamentoByRisk8(@PathVariable("risk8") Long risk8) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk8(risk8);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk9/{risk9}")
    public ResponseEntity getZoneamentoByRisk9(@PathVariable("risk9") Long risk9) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk9(risk9);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk10/{risk10}")
    public ResponseEntity getZoneamentoByRisk10(@PathVariable("risk10") Long risk10) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk10(risk10);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk11/{risk11}")
    public ResponseEntity getZoneamentoByRisk11(@PathVariable("risk11") Long risk11) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk11(risk11);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk12/{risk12}")
    public ResponseEntity getZoneamentoByRisk12(@PathVariable("risk12") Long risk12) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk12(risk12);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk13/{risk13}")
    public ResponseEntity getZoneamentoByRisk13(@PathVariable("risk13") Long risk13) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk13(risk13);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk14/{risk14}")
    public ResponseEntity getZoneamentoByRisk14(@PathVariable("risk14") Long risk14) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk14(risk14);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk15/{risk15}")
    public ResponseEntity getZoneamentoByRisk15(@PathVariable("risk15") Long risk15) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk15(risk15);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk16/{risk16}")
    public ResponseEntity getZoneamentoByRisk16(@PathVariable("risk16") Long risk16) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk16(risk16);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk17/{risk17}")
    public ResponseEntity getZoneamentoByRisk17(@PathVariable("risk17") Long risk17) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk17(risk17);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk18/{risk18}")
    public ResponseEntity getZoneamentoByRisk18(@PathVariable("risk18") Long risk18) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk18(risk18);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk19/{risk19}")
    public ResponseEntity getZoneamentoByRisk19(@PathVariable("risk19") Long risk19) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk19(risk19);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk20/{risk20}")
    public ResponseEntity getZoneamentoByRisk20(@PathVariable("risk20") Long risk20) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk20(risk20);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk21/{risk21}")
    public ResponseEntity getZoneamentoByRisk21(@PathVariable("risk21") Long risk21) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk21(risk21);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk22/{risk22}")
    public ResponseEntity getZoneamentoByRisk22(@PathVariable("risk22") Long risk22) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk22(risk22);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk23/{risk23}")
    public ResponseEntity getZoneamentoByRisk23(@PathVariable("risk23") Long risk23) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk23(risk23);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk24/{risk24}")
    public ResponseEntity getZoneamentoByRisk24(@PathVariable("risk24") Long risk24) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk24(risk24);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk25/{risk25}")
    public ResponseEntity getZoneamentoByRisk25(@PathVariable("risk25") Long risk25) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk25(risk25);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk26/{risk26}")
    public ResponseEntity getZoneamentoByRisk26(@PathVariable("risk26") Long risk26) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk26(risk26);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk27/{risk27}")
    public ResponseEntity getZoneamentoByRisk27(@PathVariable("risk27") Long risk27) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk27(risk27);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk28/{risk28}")
    public ResponseEntity getZoneamentoByRisk28(@PathVariable("risk28") Long risk28) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk28(risk28);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk29/{risk29}")
    public ResponseEntity getZoneamentoByRisk29(@PathVariable("risk29") Long risk29) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk29(risk29);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk30/{risk30}")
    public ResponseEntity getZoneamentoByRisk30(@PathVariable("risk30") Long risk30) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk30(risk30);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk31/{risk31}")
    public ResponseEntity getZoneamentoByRisk31(@PathVariable("risk31") Long risk31) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk31(risk31);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk32/{risk32}")
    public ResponseEntity getZoneamentoByRisk32(@PathVariable("risk32") Long risk32) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk32(risk32);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk33/{risk33}")
    public ResponseEntity getZoneamentoByRisk33(@PathVariable("risk33") Long risk33) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk33(risk33);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk34/{risk34}")
    public ResponseEntity getZoneamentoByRisk34(@PathVariable("risk34") Long risk34) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk34(risk34);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk35/{risk35}")
    public ResponseEntity getZoneamentoByRisk35(@PathVariable("risk35") Long risk35) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk35(risk35);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }

    @GetMapping("/risk36/{risk36}")
    public ResponseEntity getZoneamentoByRisk36(@PathVariable("risk36") Long risk36) {
        List<ZoneamentoDTO> zoneamentos = service.getZoneamentoByRisk36(risk36);
        return zoneamentos.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(zoneamentos);
    }


    // METODO - POST
    @PostMapping
    public ResponseEntity METODO_post(@RequestBody Zoneamento zoneamento){

        try{
            ZoneamentoDTO zo = service.insert(zoneamento);
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
    public ResponseEntity METODO_put(@PathVariable("id") Long id, @RequestBody Zoneamento zoneamento){

        zoneamento.setId(id);
        ZoneamentoDTO zo = service.update(zoneamento, id);
        return zo != null ? ResponseEntity.ok(zo) : ResponseEntity.notFound().build();
    }


    // METODO - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity METODO_delete(@PathVariable("id") Long id){

        boolean ok = service.delete(id);
        return ok ? ResponseEntity.ok(ok) : ResponseEntity.notFound().build();
    }
}
