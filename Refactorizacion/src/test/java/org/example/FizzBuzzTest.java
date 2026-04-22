package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void testNumerosNormales() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1", fb.calcular(1));
        assertEquals("2", fb.calcular(2));
    }

    @Test
    void testFizz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Fizz", fb.calcular(3));
    }

    @Test
    void testBuzz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("Buzz", fb.calcular(5));
    }

    @Test
    void testFizzBuzz() {
        FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.calcular(15));
    }
}