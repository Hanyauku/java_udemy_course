package com.polina;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int count = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            } else {
                avg =  sum / count;
                System.out.println("SUM = " + (int) sum + " AVG = " + Math.round(avg));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
