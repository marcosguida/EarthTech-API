package com.example.plantio.api.service;

import com.example.plantio.api.dto.ZoneamentoDTO;
import com.example.plantio.api.model.Zoneamento;
import com.example.plantio.api.repository.ZoneamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Marcos Ribeiro
 */

@Service
public class ZoneamentoService {

    @Autowired
    private ZoneamentoRepository rep;

    public List<Object> getZoneamento() { return rep.findAll().stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); };

    public Optional<ZoneamentoDTO> getZoneamentoById(Long id) { return rep.findById(id).map(ZoneamentoDTO::create); }

    public List<ZoneamentoDTO> getZoneamentoBySafra(String safra) { return rep.findBySafra(safra).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());}

    public List<ZoneamentoDTO> getZoneamentoByCultura(String cultura) { return rep.findByCultura(cultura).stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoByUf(String uf) { return rep.findByUf(uf).stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoByMunicipio(String municipio) { return rep.findByMunicipio(municipio).stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoByGrupo(String grupo) { return rep.findByGrupo(grupo).stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoBySolo(String solo) { return rep.findBySolo(solo).stream().map(ZoneamentoDTO::create).collect(Collectors.toList()); }

    public List<ZoneamentoDTO> getZoneamentoByRisk1(Long risk1) {
        return rep.findByRisk1(risk1).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk2(Long risk2) {
        return rep.findByRisk2(risk2).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk3(Long risk3) {
        return rep.findByRisk3(risk3).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk4(Long risk4) {
        return rep.findByRisk4(risk4).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk5(Long risk5) {
        return rep.findByRisk5(risk5).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk6(Long risk6) {
        return rep.findByRisk6(risk6).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk7(Long risk7) {
        return rep.findByRisk7(risk7).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk8(Long risk8) {
        return rep.findByRisk8(risk8).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk9(Long risk9) {
        return rep.findByRisk9(risk9).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk10(Long risk10) {
        return rep.findByRisk10(risk10).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk11(Long risk11) {
        return rep.findByRisk11(risk11).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk12(Long risk12) {
        return rep.findByRisk12(risk12).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk13(Long risk13) {
        return rep.findByRisk13(risk13).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk14(Long risk14) {
        return rep.findByRisk14(risk14).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk15(Long risk15) {
        return rep.findByRisk15(risk15).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk16(Long risk16) {
        return rep.findByRisk16(risk16).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk17(Long risk17) {
        return rep.findByRisk17(risk17).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk18(Long risk18) {
        return rep.findByRisk18(risk18).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk19(Long risk19) {
        return rep.findByRisk19(risk19).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk20(Long risk20) {
        return rep.findByRisk20(risk20).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk21(Long risk21) {
        return rep.findByRisk21(risk21).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk22(Long risk22) {
        return rep.findByRisk22(risk22).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk23(Long risk23) {
        return rep.findByRisk23(risk23).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk24(Long risk24) {
        return rep.findByRisk24(risk24).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk25(Long risk25) {
        return rep.findByRisk25(risk25).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk26(Long risk26) {
        return rep.findByRisk26(risk26).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk27(Long risk27) {
        return rep.findByRisk27(risk27).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk28(Long risk28) {
        return rep.findByRisk28(risk28).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk29(Long risk29) {
        return rep.findByRisk29(risk29).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk30(Long risk30) {
        return rep.findByRisk30(risk30).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk31(Long risk31) {
        return rep.findByRisk31(risk31).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk32(Long risk32) {
        return rep.findByRisk32(risk32).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk33(Long risk33) {
        return rep.findByRisk33(risk33).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk34(Long risk34) {
        return rep.findByRisk34(risk34).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk35(Long risk35) {
        return rep.findByRisk35(risk35).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }

    public List<ZoneamentoDTO> getZoneamentoByRisk36(Long risk36) {
        return rep.findByRisk36(risk36).stream().map(ZoneamentoDTO::create).collect(Collectors.toList());
    }


    public ZoneamentoDTO insert(Zoneamento zoneamento) { Assert.isNull(zoneamento.getId(),"Não foi possível inserir o registro de zoneamento!");
        return ZoneamentoDTO.create(rep.save(zoneamento));
    }

    public ZoneamentoDTO update(Zoneamento zoneamento, Long id) {
        Assert.notNull(id,"Não foi possível atualizar o registro de zoneamento");

        // Busca as informações de zoneamento no banco de dados
        Optional<Zoneamento> optional = rep.findById(id);
        if(optional.isPresent()) {
            Zoneamento db = optional.get();

            // Copia as propriedades para o objeto 'db'
            db.setSafra(zoneamento.getSafra());
            db.setCultura(zoneamento.getCultura());
            db.setUf(zoneamento.getUf());
            db.setMunicipio(zoneamento.getMunicipio());
            db.setGrupo(zoneamento.getGrupo());
            db.setSolo(zoneamento.getSolo());
            db.setRisk1(zoneamento.getRisk1());
            db.setRisk2(zoneamento.getRisk2());
            db.setRisk3(zoneamento.getRisk3());
            db.setRisk4(zoneamento.getRisk4());
            db.setRisk5(zoneamento.getRisk5());
            db.setRisk6(zoneamento.getRisk6());
            db.setRisk7(zoneamento.getRisk7());
            db.setRisk8(zoneamento.getRisk8());
            db.setRisk9(zoneamento.getRisk9());
            db.setRisk10(zoneamento.getRisk10());
            db.setRisk11(zoneamento.getRisk11());
            db.setRisk12(zoneamento.getRisk12());
            db.setRisk13(zoneamento.getRisk13());
            db.setRisk14(zoneamento.getRisk14());
            db.setRisk15(zoneamento.getRisk15());
            db.setRisk16(zoneamento.getRisk16());
            db.setRisk17(zoneamento.getRisk17());
            db.setRisk18(zoneamento.getRisk18());
            db.setRisk19(zoneamento.getRisk19());
            db.setRisk20(zoneamento.getRisk20());
            db.setRisk21(zoneamento.getRisk21());
            db.setRisk22(zoneamento.getRisk22());
            db.setRisk23(zoneamento.getRisk23());
            db.setRisk24(zoneamento.getRisk24());
            db.setRisk25(zoneamento.getRisk25());
            db.setRisk26(zoneamento.getRisk26());
            db.setRisk27(zoneamento.getRisk27());
            db.setRisk28(zoneamento.getRisk28());
            db.setRisk29(zoneamento.getRisk29());
            db.setRisk30(zoneamento.getRisk30());
            db.setRisk31(zoneamento.getRisk31());
            db.setRisk32(zoneamento.getRisk32());
            db.setRisk33(zoneamento.getRisk33());
            db.setRisk34(zoneamento.getRisk34());
            db.setRisk35(zoneamento.getRisk35());
            db.setRisk36(zoneamento.getRisk36());
            System.out.println("Zoneamento id " + db.getId());

            // Atualiza o zoneamento
            rep.save(db);

            return ZoneamentoDTO.create(db);
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro de zoneamento! ");
        }
    }

    public boolean delete(Long id) {
        if(getZoneamentoById(id).isPresent()) {
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
