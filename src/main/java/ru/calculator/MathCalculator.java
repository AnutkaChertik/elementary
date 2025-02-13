package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return division(first, second)
                + difference(first, second);
    }

    public static double result(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + division(first, second)
                + difference(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета ++* равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета -+/ равен: " + difAndDiv(10, 20));
        System.out.println("Результат расчета +*-/ равен: " + result(10, 20));
    }
}
