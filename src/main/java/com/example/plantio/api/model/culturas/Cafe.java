package com.example.plantio.api.model.culturas;

import com.example.plantio.api.model.Zoneamento;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("cafe")
public class Cafe extends Zoneamento {

    public Cafe(Long id, String safra, String cultura, String uf, String municipio, String grupo, String solo,
                Long risk1, Long risk2, Long risk3, Long risk4, Long risk5, Long risk6, Long risk7, Long risk8,
                Long risk9, Long risk10, Long risk11, Long risk12, Long risk13, Long risk14, Long risk15, Long risk16,
                Long risk17, Long risk18, Long risk19, Long risk20, Long risk21, Long risk22, Long risk23, Long risk24,
                Long risk25, Long risk26, Long risk27, Long risk28, Long risk29, Long risk30, Long risk31, Long risk32,
                Long risk33, Long risk34, Long risk35, Long risk36) {
        super(id, safra, cultura, uf, municipio, grupo, solo, risk1, risk2, risk3, risk4, risk5, risk6, risk7, risk8,
                risk9, risk10, risk11, risk12, risk13, risk14, risk15, risk16, risk17, risk18, risk19, risk20, risk21,
                risk22, risk23, risk24, risk25, risk26, risk27, risk28, risk29, risk30, risk31, risk32, risk33, risk34,
                risk35, risk36);
    }

    public Cafe() {
        super();
    }
}
