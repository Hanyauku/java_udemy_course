package com.polina;

public class Main {

    public static void main(String[] args) {
        String numberAsstring = "2018.125";
        System.out.println("numberAsString = " + numberAsstring);

        double number = Double.parseDouble(numberAsstring);
        System.out.println("number = " + number);

        numberAsstring += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsstring);
        System.out.println("number = " + number);
    }
}
