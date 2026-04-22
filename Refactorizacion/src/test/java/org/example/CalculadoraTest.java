package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testVacio() {
        assertEquals(0, new Calculadora().suma(""));
    }

    @Test
    void testUno() {
        assertEquals(1, new Calculadora().suma("1"));
    }

    @Test
    void testVarios() {
        assertEquals(3, new Calculadora().suma("1,2"));
    }

    @Test
    void testErrorSeparador() {
        assertEquals(-1, new Calculadora().suma("1,2,"));
    }

    @Test
    void testNegativos() {
        assertEquals(-1, new Calculadora().suma("1,2,-2"));
    }

    @Test
    void testMayor1000() {
        assertEquals(5, new Calculadora().suma("5,1002"));
    }
}