package matgor94.ahe.controller;

import matgor94.ahe.domain.model.KlasyfikacjaEntity;
import matgor94.ahe.domain.service.KlasyfikacjaService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KlasyfikacjaControllerTest {

    public final KlasyfikacjaService klasyfikacjaService;

    KlasyfikacjaControllerTest(KlasyfikacjaService klasyfikacjaService) {
        this.klasyfikacjaService = klasyfikacjaService;
    }

    @Test
    void klasyfikacjaEntityPrzygotowanie() {
        int iloscKlasyf = klasyfikacjaService.wszytskieKlasyfikacje().size();
        KlasyfikacjaEntity klasyfikacja = new KlasyfikacjaEntity();
        klasyfikacjaService.dodaj(klasyfikacja);
        assertEquals(iloscKlasyf, klasyfikacjaService.wszytskieKlasyfikacje().size());
    }
}