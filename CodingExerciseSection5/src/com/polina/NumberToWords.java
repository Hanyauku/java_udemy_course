package com.polina;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        else if (number == 0) System.out.println("Zero");
        else {
            int reverseNumber = reverse(number);
            int diff = getDigitCount(number) - getDigitCount(reverseNumber);
            while (reverseNumber > 0) {
                switch (reverseNumber % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Value");
                }
                reverseNumber /= 10;
            }
            while (diff > 0) {
                System.out.println("Zero");
                diff--;
            }
        }

    }

    public static int reverse(int number) {
        boolean isNegative = false;
        if (number < 0) {
            number *= -1;
            isNegative = true;
        }
        int reverseNumber = 0;
        while (number >= 10) {
            reverseNumber = (reverseNumber + (number % 10)) * 10;
            number /= 10;
        }
        reverseNumber += number;
        if (isNegative) reverseNumber *= -1;
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int count = 0;
        while (number >= 10) {
            count++;
            number /= 10;
        }
        count++;
        return count;
    }
}
