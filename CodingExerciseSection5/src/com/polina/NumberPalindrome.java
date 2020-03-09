package com.polina;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int result = 0;
        int changeNumber = number > 0 ? number : 0 - number;
        while (changeNumber > 0) {
            result = result * 10 + changeNumber % 10;
            changeNumber /= 10;
        }
        return  result == number || result == 0 - number;
    }
}
