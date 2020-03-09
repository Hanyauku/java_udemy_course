package com.polina;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number > 1) {
            int result = 1;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    boolean isPrime = true;
                    for (int j = 2; j < i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) result = i;
                }
            }
            return result;
        }
        return -1;
    }
}
