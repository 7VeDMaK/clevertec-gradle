package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringUtils {

    private static final Logger LOGGER = Logger.getLogger(StringUtils.class.getName());

    public boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            return Double.parseDouble(str) > 0;
        } catch (NumberFormatException e) {
            LOGGER.log(Level.WARNING, "Invalid number format for input: " + str, e);
            return false;
        }
    }
}
