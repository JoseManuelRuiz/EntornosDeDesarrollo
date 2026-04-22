package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteTest {

    Compte compte = new Compte("1234567890", "Test");

    @Test
    public void testCompruebaIBAN() {
        assertTrue(compte.compruebaIBAN("ES6621000418401234567891"));
        assertTrue(compte.compruebaIBAN("ES6000491500051234567892"));
        assertTrue(compte.compruebaIBAN("ES9420805801101234567891"));

        assertFalse(compte.compruebaIBAN("ES7600246912501234567891"));
        assertFalse(compte.compruebaIBAN("ES4721000418401234567891"));
        assertFalse(compte.compruebaIBAN("ES8200491500051234567892"));
    }

    @Test
    public void testGeneraIBAN() {
        assertEquals("ES7100302053091234567895",
                compte.generaIBAN("0030","2053","09","1234567895"));

        assertEquals("ES1000492352082414205416",
                compte.generaIBAN("0049","2352","08","2414205416"));

        assertEquals("ES1720852066623456789011",
                compte.generaIBAN("2085","2066","62","3456789011"));

        assertNull(compte.generaIBAN("2085","2066","62","3456AE9011"));
        assertNull(compte.generaIBAN("208","2066","62","3456789011"));
        assertNull(compte.generaIBAN("2080","20A6","62","3456789011"));
        assertNull(compte.generaIBAN("2080","2086","6","3456789011"));
        assertNull(compte.generaIBAN("2080","2086","63","345678911"));
    }

}