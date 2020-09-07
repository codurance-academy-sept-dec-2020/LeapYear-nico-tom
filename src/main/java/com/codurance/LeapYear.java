package com.codurance;

public class LeapYear {
    public static Boolean isALeapYear(int year) {
        if(isDivisibleBy(year,4)) {
            return true;
        }
        return false;
    }

    private static boolean isDivisibleBy(int number, int diviser) {
        return number % diviser == 0;
    }
}
