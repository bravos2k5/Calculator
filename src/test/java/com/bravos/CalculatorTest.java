package com.bravos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void plus() {
        assertEquals(5, calculator.plus(2, 3));
        assertEquals(0, calculator.plus(-1, 1));
        assertEquals(-5, calculator.plus(-2, -3));
    }

    @Test
    void minus() {
        assertEquals(2, calculator.minus(5, 3));
        assertEquals(-2, calculator.minus(3, 5));
        assertEquals(0, calculator.minus(7, 7));
    }
}
