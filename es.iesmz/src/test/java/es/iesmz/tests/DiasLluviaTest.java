package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {

    @Test
    public void testRegistroDia() {
        DiasLluvia d = new DiasLluvia();

        assertEquals(true, d.registroDia(1, 1, true));
        assertEquals(true, d.registroDia(10, 5, false));
        assertNotEquals(true, d.registroDia(32, 1, true));
    }

    @Test
    public void testConsultarDia() {
        DiasLluvia d = new DiasLluvia();
        d.registroDia(1, 1, true);

        assertEquals(true, d.consultarDia(1, 1));
        assertEquals(false, d.consultarDia(2, 1));
        assertNotEquals(true, d.consultarDia(32, 1));
    }

    @Test
    public void testContarDiasLluviosos() {
        DiasLluvia d = new DiasLluvia();

        d.registroDia(1, 1, true);
        d.registroDia(2, 1, true);

        assertEquals(2, d.contarDiasLluviosos());
        assertEquals(0, new DiasLluvia().contarDiasLluviosos());
        assertNotEquals(1, d.contarDiasLluviosos());
    }

    @Test
    public void testTrimestreLluvioso() {
        DiasLluvia d = new DiasLluvia();

        d.registroDia(1, 1, true);
        d.registroDia(2, 1, true);
        d.registroDia(1, 7, true);

        assertEquals(1, d.trimestreLluvioso());
        assertNotEquals(3, d.trimestreLluvioso());
    }

    @Test
    public void testPrimerDiaLluvia() {
        DiasLluvia d = new DiasLluvia();

        d.registroDia(10, 1, true);

        assertEquals(10, d.primerDiaLluvia());
        assertNotEquals(1, d.primerDiaLluvia());

        DiasLluvia d2 = new DiasLluvia();
        assertEquals(-1, d2.primerDiaLluvia());
    }
}