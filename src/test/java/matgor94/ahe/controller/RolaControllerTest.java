package matgor94.ahe.controller;

import matgor94.ahe.domain.model.RolaEntity;
import matgor94.ahe.domain.service.RolaService;
import org.junit.Test;


import java.util.List;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class RolaControllerTest {

    private final RolaService rolaService;

    RolaControllerTest(RolaService rolaService) {
        this.rolaService = rolaService;
    }

    @Test
    public void pokazWszystkieRole() {
        List<RolaEntity> pozadaneRole = rolaService.listaRol();
        int oczekiwanie = 4;
        assertEquals(oczekiwanie, rolaService.listaRol().size());
    }
}