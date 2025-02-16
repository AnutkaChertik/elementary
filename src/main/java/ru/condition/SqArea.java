package ru.condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        result1 = SqArea.square(5, 2);
        System.out.println(" p = 5, k = 2, s = 1.39, real = " + result1);
        result1 = SqArea.square(6, 9);
        System.out.println(" p = 6, k = 9, s = 0.81, real = " + result1);
    }
}
