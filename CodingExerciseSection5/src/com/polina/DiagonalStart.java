package com.polina;

public class DiagonalStart {
    public static void printSquareStar(int number) {
        if (number >= 5) {
            // rows
            for (int i = 0; i < number; i++) {
                // columns
                for (int j = 0; j < number; j++) {
                    if (i == 0 || i == number - 1) {
                        System.out.print("*");
                    } else if (j == 0 || j == number -1 || j == i || j == number - 1 - i ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else System.out.println("Invalid Value");
    }
}
