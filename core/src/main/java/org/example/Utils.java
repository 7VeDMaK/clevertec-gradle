package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {

    private static final Logger LOGGER = Logger.getLogger(Utils.class.getName());

    public boolean isAllPositiveNumbers(String... str) {
        StringUtils strUtils = new StringUtils();
        for (String s : str) {
            try {
                if (!strUtils.isPositiveNumber(s)) {
                    return false;
                }
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "An error occurred while checking if the string is a positive number: " + s, e);
                return false;
            }
        }
        return true;
    }
}
