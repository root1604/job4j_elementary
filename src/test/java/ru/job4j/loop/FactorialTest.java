package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int number = 5;
        int actual = Factorial.calc(number);
        int expected = 120;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int number = 0;
        int actual = Factorial.calc(number);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
