package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to1() {
        int[] input = {1, 2, 3, 4};
        int source = 2;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 3, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapZeroToThree() {
        String[] input = {"one", "two", "three", "four"};
        int source = 0;
        int dest = input.length - 1;
        String[] result = SwitchArray.swap(input, source, dest);
        String[] expected = {"four", "two", "three", "one"};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapTwoToOne() {
        String[] input = {"one", "two", "three", "four"};
        int source = 2;
        int dest = 1;
        String[] result = SwitchArray.swap(input, source, dest);
        String[] expected = {"one", "three", "two", "four"};
        Assert.assertArrayEquals(expected, result);
    }
}
