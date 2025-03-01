package by.it.nikitko.jd01_05;

import static java.lang.Math.*;

public class TaskA {
    public static void main(String[] args) {
        step1();
        step2();
        step3();
    }

    private static void step1() {
        double a = 756.13;
        double x = 0.3;
        double part1 = cos(pow((x * x + PI / 6), 5));
        double part2 = sqrt(x * pow(a, 3));
        double part3 = log(abs((a - 1.12 * x) / 4));
        double z = part1 - part2 - part3;
        System.out.println(z);
        //Закомментированно из-за Warning
        //  z=cos(pow((x*x+PI/6),5))-sqrt(x*pow(a,3))-log(abs((a-1.12*x)/4));
        System.out.println(z);
    }

    private static void step2() {
        double a = 1.21;
        double b = 0.371;
        double part1 = tan(pow((a + b), 2));
        double part2 = cbrt((a + 1.5));
        double part3 = a * pow(b, 5) - (b / log(a * a));
        double y = part1 - part2 + part3;
        System.out.println(y);
    }

    private static void step3() {
        final double X = 12.1;
        for (double a = -5; a <= 12; a = a + 3.75) {
           double f = pow(E,(a*X))-3.45*a;
            System.out.printf("a = %5.2f f = %-8.4e %n",a,f);
        }
    }

}
