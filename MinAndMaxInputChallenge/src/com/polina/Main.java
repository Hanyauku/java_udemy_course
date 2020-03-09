package com.polina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//        boolean first = true;

        while (true) {

            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
//                if (first) {
//                    min = number;
//                    max = number;
//                    first = false;
//                }
                if (number > max) max = number;
                if (number < min) min = number;
            } else {
                System.out.println("Minimum number you entered is " + min);
                System.out.println("Maximum number you entered is " + max);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
