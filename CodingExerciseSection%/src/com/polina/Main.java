package com.polina;

import static com.polina.NumberOfDaysInMonth.getDaysInMonth;
import static com.polina.NumberOfDaysInMonth.isLeapYear;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}
