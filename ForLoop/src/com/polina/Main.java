package com.polina;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000d, 2d));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000d, 3d));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000d, 4d));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000d, 5d));

        for (int i = 1; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000d, i)));
        }

        System.out.println("------------------------------");

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000d, i)));
        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime number");
                count++;
            }
            if (count == 3) {
                System.out.println("Exiting the loop");
                break;
            }
        }

        int sum = 0;
        count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                sum += i;
                System.out.println(i + "is divisible by 3 and 5");
                count++;
            }
            if (count == 5) break;;
        }
        System.out.println("The sum is " + sum);
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static double calculateInterest(double amount, double interestRate) {
        return amount * interestRate / 100;
    }
}
