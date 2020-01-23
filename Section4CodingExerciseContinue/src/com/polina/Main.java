package com.polina;

import static com.polina.AreaCalculator.area;
import static com.polina.IntEqualityPrinter.printEqual;
import static com.polina.MinutesToYearsDaysCalculator.printYearsAndDays;
import static com.polina.PlayingCat.isCatPlaying;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}
