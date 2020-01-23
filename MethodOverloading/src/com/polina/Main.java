package com.polina;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(157));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3954));
        System.out.println(getDurationString(-41));
    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score + 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player" + " scored " + score + " points");
        return score + 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        }
        return (feet * 12 + inches) * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        inches %= 12;
        return calcFeetAndInchesToCentimeters(feet, inches);
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        return convert(minutes / 60) + "h " + convert(minutes % 60) + "m " + convert(seconds) + "s";
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        return getDurationString(seconds / 60, seconds % 60);
    }

    private static String convert(int time) {
        if (time < 10) {
            return "0" + time;
        }
        return "" + time;
    }
}
