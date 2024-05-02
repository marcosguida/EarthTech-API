package com.example.plantio;

import com.example.plantio.api.dto.ZoneamentoDTO;
import com.example.plantio.api.model.Zoneamento;
import com.example.plantio.api.service.ZoneamentoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.http.client.MockClientHttpResponse;
import java.util.Optional;
import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Marcos Ribeiro
 */

@SpringBootTest
public class EarthTechApiApplicationTests {

    @Autowired
    private ZoneamentoService service;
    private MockClientHttpResponse response;

    @Test
    public void TestSaveZoneamento() {
        Zoneamento zoneamento = new Zoneamento();
        zoneamento.setCultura("Açai");
        zoneamento.setSafra("2024-2025");
        zoneamento.setMunicipio("Palmas");
        zoneamento.setSolo("AD1");
        zoneamento.setMicrorregiao("Palmas e Serra do Carmo");

        //INSERT
        ZoneamentoDTO zo = service.insert (zoneamento);
        assertNotNull (zo);

        // GET (BUSCAR)
        Long id = zo.getId();
        assertNotNull (id);

        Optional<ZoneamentoDTO> op = service.getZoneamentoById(id);
        assertTrue (op.isPresent());

        zo = op.get();
        assertEquals("Açai", zo.getCultura());
        assertEquals("2024-2025", zo.getSafra());
        assertEquals("Palmas", zo.getMunicipio());
        assertEquals("AD1", zo.getSolo());
        assertEquals("Palmas e Serra do Carmo", zo.getmicrorregiao());

        // DELETE
        service.delete(id);

    }

}
