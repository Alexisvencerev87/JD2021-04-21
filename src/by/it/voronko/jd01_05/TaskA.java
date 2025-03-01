package by.it.voronko.jd01_05;
import static java.lang.Math.*;
public class TaskA {
    public static void main(String[] args) {
        zadacha1();
        zadacha2();
        zadacha3();
    }

    private static void zadacha1() {
        double a =756.13;
        double x =0.3;
        double z =cos(pow((x*x+PI/6),5));
        z=z-sqrt(x*pow(a,3));
        z=z-log(abs((a-1.12*x)/4));
        System.out.println("z="+z);

    }

    private static void zadacha2() {
        double a =1.21;
        double b=0.371;
        double y=tan(pow((a+b),2));
        y=y-cbrt(a+1.5)+a*pow(b,5)-b/log(pow(a,2));
        System.out.println("y="+y);
    }

    private static void zadacha3() {
        double x=12.1;
        double a;
        for ( a =-5; a <=12 ; a=a+3.75) {
            double f=exp(a*x)-3.45*a;
            System.out.printf("При a=%6.2f f=%g\n",a,f);
        }
    }
}
