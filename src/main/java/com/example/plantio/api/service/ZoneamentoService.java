package com.example.plantio.api.service;

import com.example.plantio.api.dto.ZoneamentoDTO;
import com.example.plantio.api.model.Zoneamento;
import com.example.plantio.api.repository.ZoneamentoRepository;
import com.example.plantio.api.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Serviço específico de Zoneamento que reutiliza a lógica CRUD genérica.
 */
@Service
public class ZoneamentoService extends AbstractCrudService<Zoneamento, ZoneamentoDTO, ZoneamentoRepository> {

    public ZoneamentoService(ZoneamentoRepository rep) {
        super(rep, ZoneamentoDTO::create);
    }

    public List<ZoneamentoDTO> getZoneamentoBySafra(String safra) { return rep.findBySafra(safra).stream().map(toDTO).collect(Collectors.toList());}

    public List<ZoneamentoDTO> getZoneamentoByCultura(String cultura) { return rep.findByCultura(cultura).stream().map(toDTO).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoByUf(String uf) { return rep.findByUf(uf).stream().map(toDTO).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoByMunicipio(String municipio) { return rep.findByMunicipio(municipio).stream().map(toDTO).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoByGrupo(String grupo) { return rep.findByGrupo(grupo).stream().map(toDTO).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoBySolo(String solo) { return rep.findBySolo(solo).stream().map(toDTO).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoByRisk1(Long risk1) {
        return rep.findByRisk1(risk1).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk2(Long risk2) {
        return rep.findByRisk2(risk2).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk3(Long risk3) {
        return rep.findByRisk3(risk3).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk4(Long risk4) {
        return rep.findByRisk4(risk4).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk5(Long risk5) {
        return rep.findByRisk5(risk5).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk6(Long risk6) {
        return rep.findByRisk6(risk6).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk7(Long risk7) {
        return rep.findByRisk7(risk7).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk8(Long risk8) {
        return rep.findByRisk8(risk8).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk9(Long risk9) {
        return rep.findByRisk9(risk9).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk10(Long risk10) {
        return rep.findByRisk10(risk10).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk11(Long risk11) {
        return rep.findByRisk11(risk11).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk12(Long risk12) {
        return rep.findByRisk12(risk12).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk13(Long risk13) {
        return rep.findByRisk13(risk13).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk14(Long risk14) {
        return rep.findByRisk14(risk14).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk15(Long risk15) {
        return rep.findByRisk15(risk15).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk16(Long risk16) {
        return rep.findByRisk16(risk16).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk17(Long risk17) {
        return rep.findByRisk17(risk17).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk18(Long risk18) {
        return rep.findByRisk18(risk18).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk19(Long risk19) {
        return rep.findByRisk19(risk19).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk20(Long risk20) {
        return rep.findByRisk20(risk20).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk21(Long risk21) {
        return rep.findByRisk21(risk21).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk22(Long risk22) {
        return rep.findByRisk22(risk22).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk23(Long risk23) {
        return rep.findByRisk23(risk23).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk24(Long risk24) {
        return rep.findByRisk24(risk24).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk25(Long risk25) {
        return rep.findByRisk25(risk25).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk26(Long risk26) {
        return rep.findByRisk26(risk26).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk27(Long risk27) {
        return rep.findByRisk27(risk27).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk28(Long risk28) {
        return rep.findByRisk28(risk28).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk29(Long risk29) {
        return rep.findByRisk29(risk29).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk30(Long risk30) {
        return rep.findByRisk30(risk30).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk31(Long risk31) {
        return rep.findByRisk31(risk31).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk32(Long risk32) {
        return rep.findByRisk32(risk32).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk33(Long risk33) {
        return rep.findByRisk33(risk33).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk34(Long risk34) {
        return rep.findByRisk34(risk34).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk35(Long risk35) {
        return rep.findByRisk35(risk35).stream().map(toDTO).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk36(Long risk36) {
        return rep.findByRisk36(risk36).stream().map(toDTO).collect(Collectors.toList());
    }
}
