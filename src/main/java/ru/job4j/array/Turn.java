package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int halfOfArray = array.length / 2;
        int temp;
        for (int i = 0; i < halfOfArray; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
