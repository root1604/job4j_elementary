package ru.job4j.calculator;

public class Calculator {
    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return add(
                first,
                add(second, third)
        );
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int addition = one + two;
        int division = six / two;
        int subtraction = five - two;
        int multiplication = four * two;
        System.out.println(addition);
        System.out.println(division);
        System.out.println(subtraction);
        System.out.println(multiplication);
    }
}
