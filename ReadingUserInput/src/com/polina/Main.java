package com.polina;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readingUserInputChallenge();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//        if (hasNextInt) {
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine(); // handle next line character (enter key)
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//
//            int age = 2020 - yearOfBirth;
//            if (age >= 0 && age <= 100)  System.out.println("Your name is " + name + ", and you are " + age + " years old");
//            else System.out.println("Invalid year of birth");
//        } else {
//            System.out.println("Unable to parse year of birth");
//        }
//
//        scanner.close();
    }

    public static void readingUserInputChallenge() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (count < 10) {
            System.out.println("Enter a number #" + (count + 1) + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                System.out.println("You entered number #" + count + ":" + number);
            } else {
                System.out.println("Invalid Value");
            }
            scanner.nextLine(); // handle end of iteration
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}
