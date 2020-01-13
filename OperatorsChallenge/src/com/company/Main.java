package com.company;

public class Main {

    public static void main(String[] args) {

        double Double = 20.00d;
        double SecondDouble = 80.00d;
        double result = (Double + SecondDouble) * 100.00d;
        result %= 40.00d;
        boolean isZero = result == 0 ? true : false;
        System.out.println("Is it zero ? " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder");;
        }
    }
}
