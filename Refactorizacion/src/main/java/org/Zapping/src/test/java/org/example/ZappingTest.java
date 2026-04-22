package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ZappingTest {

    @Test
    void mismoCanal_devuelve0() {
        assertEquals(0, Zapping.minClicks(0, 0));
    }
}