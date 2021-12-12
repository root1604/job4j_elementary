package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNo7ThenMinus1() {
        int[] data = new int[]{5, 4, 3, 2};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIntervalHas7Then0() {
        int[] data = new int[] {7, 10, 3};
        int el = 7;
        int start = 0;
        int finish = 1;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIntervalHasNo5ThenMinus1() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 5;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
