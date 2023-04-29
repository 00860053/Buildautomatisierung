package org.campus02.configexam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {
    @Test
    void multiplyReturnsProductOfTwoNumbers() {
        RomanNumerals romanNumerals = new RomanNumerals();

        assertEquals(6, romanNumerals.multiply(2,3));
    }
}