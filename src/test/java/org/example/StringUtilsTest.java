package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testIsPositiveNumber(){
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPositiveNumber("123"), "Positive number check failed");
        assertFalse(utils.isPositiveNumber("-123"), "Negative number check failed");
        assertFalse(utils.isPositiveNumber("0"), "Zero check failed");
        assertFalse(utils.isPositiveNumber("abc"), "Non-number check failed");
        assertFalse(utils.isPositiveNumber(""), "Empty string check failed");
        assertFalse(utils.isPositiveNumber(null), "Null check failed");
    }
}
