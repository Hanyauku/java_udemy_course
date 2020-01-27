package com.polina;

public class Main {

    public static void main(String[] args) {

//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 7;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char myChar = 'D';
        switch (myChar) {
            case 'A':
                System.out.println("That was A");
                break;
            case 'B':
                System.out.println("That was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("That was " + myChar);
                break;
            default:
                System.out.println("that was some char");
                break;
        }

        String month ="JANUAry";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("not sure");
                break;
        }
    }
}
