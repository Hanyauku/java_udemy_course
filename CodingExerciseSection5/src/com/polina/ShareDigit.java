package com.polina;

public class ShareDigit {
    public static boolean hasSharedDigit(int first, int second) {
        if (first > 99 || second > 99 || first < 10 || second < 10) return false;

        return (first % 10 == second % 10) || (first % 10 == second / 10)
                || (first / 10 == second % 10) || (first / 10 == second / 10);
    }
}
