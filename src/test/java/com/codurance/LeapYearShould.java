package com.codurance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearShould {

    @Test
    public void return_false_when_not_divisible_by_four() {
        boolean isLeapYear = LeapYear.isALeapYear(3);
        Assertions.assertFalse(isLeapYear);
    }

    @Test public void return_true_when_divisible_by_four() {
        boolean isLeapYear = LeapYear.isALeapYear(4);
        Assertions.assertTrue(isLeapYear);
    }
}
