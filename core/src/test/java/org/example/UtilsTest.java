package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {

    @Test
    public void testIsAllPositiveNumbers() {
        Utils utils = new Utils();
        assertTrue(utils.isAllPositiveNumbers("12", "79"));
        assertTrue(utils.isAllPositiveNumbers());
        assertFalse(utils.isAllPositiveNumbers("", "12"));
        assertFalse(utils.isAllPositiveNumbers(null, "-12"));
    }
}
