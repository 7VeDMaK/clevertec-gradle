package org.example;
public class Utils {
    public boolean isAllPositiveNumbers(String... str){
        StringUtils strUtils = new StringUtils();
        for(String s : str){
            if (!strUtils.isPositiveNumber(s)) return false;
        }
        return true;
    }
}
