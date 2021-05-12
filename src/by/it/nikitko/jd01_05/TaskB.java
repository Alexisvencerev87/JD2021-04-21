package by.it.nikitko.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }

    private static void step1() {
        double sum = 0;
        double a;
        for (a = 0; a <= 2; a = a + 0.2) {
            for (int x = 1; x <= 6; x++) {
                sum = sum + ((pow(7, a)) - (cos(x)));
            }
            System.out.printf("При a=%3.2f Сумма y = %12.10e %n", a, sum);
        }
    }

    private static void step2() {
        double b;
        double x;
        for (x = -5.5; x < 2; x = x + 0.5) {
            if (-2 < (x / 2) && (x / 2) <= -1) {
                b = sin(x * x);
                calculateA(b, x);

            } else if (-1 < (x / 2) && (x / 2) < 0.2) {
                b = cos(x * x);
                calculateA(b, x);

            } else if ((x / 2) == 0.2) {
                b = (cos(x)) / (sin(x));
                calculateA(b, x);

            } else {
                System.out.printf("При x/2= %.2f функция не определена %n", x / 2);
            }
        }
    }

    private static void calculateA(double b, double x) {
        double a = log10(abs(b + 2.74));
        System.out.printf("При x/2= %.2f a= %-10.5e %n", x / 2, a);
    }
}
