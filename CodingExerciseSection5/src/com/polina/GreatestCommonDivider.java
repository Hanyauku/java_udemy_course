package com.polina;

public class GreatestCommonDivider {
    public static int getGreatestCommonDivider(int first, int second) {
        if (first < 10 || second < 10) return -1;
        int divider = 0;
        int result = 1;
        while (first >= divider && second >= divider) {
            divider++;
            if (first % divider == 0 && second % divider == 0) result = divider;
        }
        return result;
    }
}
