package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Divisible3Test {

    @Test
    void test2() {
        assertEquals("SI", Divisible3.esDivisible(2));
    }

    @Test
    void test6() {
        assertEquals("SI", Divisible3.esDivisible(6));
    }

    @Test
    void test4() {
        assertEquals("NO", Divisible3.esDivisible(4));
    }


}