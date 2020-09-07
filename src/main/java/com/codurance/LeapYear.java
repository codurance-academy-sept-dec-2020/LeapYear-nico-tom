package com.codurance;

public class LeapYear {
    public static Boolean isALeapYear(int year) {
        if (isDivisibleBy(year, 100) && !isDivisibleBy(year, 400)) return false;
        return isDivisibleBy(year, 4);
    }

    private static boolean isDivisibleBy(int number, int diviser) {
        return number % diviser == 0;
    }
}
