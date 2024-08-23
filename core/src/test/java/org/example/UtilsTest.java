package org.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

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
