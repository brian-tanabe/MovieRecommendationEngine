package com.btanabe.mre.helpers;

/**
 * Created by Brian on 2/22/15.
 */
public class MoneyHelper {

    public static int getRealDollarValue(String compactNotation) {
        String currencySignRemoved = compactNotation.replace("$", "");
        int multiplicationFactor = getMultiplicationFactor(currencySignRemoved);
        String multiplicationFactorRemoved = currencySignRemoved.replaceAll("[a-zA-Z]", "");
        return (int) (Double.parseDouble(multiplicationFactorRemoved) * multiplicationFactor);
    }

    private static int getMultiplicationFactor(String dollarValue) {
        if (dollarValue.toLowerCase().contains("k"))
            return 1000;
        else if (dollarValue.toLowerCase().contains("m"))
            return 1000000;
        else if (dollarValue.toLowerCase().contains("b"))
            return 1000000000;
        else
            return 1;
    }
}
