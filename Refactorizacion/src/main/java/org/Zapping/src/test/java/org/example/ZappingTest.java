package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ZappingTest {

    @Test
    void mismoCanal_devuelve0() {
        assertEquals(0, Zapping.minClicks(0, 0));
    }

    @Test
    void de1a2_devuelve1() {
        assertEquals(1, Zapping.minClicks(1, 2));
    }

    @Test
    void de10a30_devuelve20() {
        assertEquals(20, Zapping.minClicks(10, 30));
    }

    @Test
    void de2a99_devuelve2() {
        assertEquals(2, Zapping.minClicks(2, 99));
    }

    @Test
    void de5a63_devuelve41() {
        assertEquals(41, Zapping.minClicks(5, 63));
    }

    @Test
    void de63a5_devuelve41() {
        assertEquals(41, Zapping.minClicks(63, 5));
    }

    @Test
    void de1a51_devuelve49() {
        assertEquals(49, Zapping.minClicks(1, 51));
    }
}