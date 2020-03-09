package com.polina;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int one, int two, int three) {
        if (isValid(one) && isValid(two) && isValid(three)) {
            return one % 10 == two % 10 || three % 10 == two % 10 || one % 10 == three % 10;
        }
        return false;
    }

    public static boolean isValid(int number) {
        return number >= 10  && number <= 1000;
    }
}
