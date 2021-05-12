package by.it.krukouski.jd01_02;


import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        step1(array);
        step2(array);
        step3(array);
    }


    static void step1(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }
        System.out.println(min + " " + max);

    }

    static void step2(int[] array) {
        double sum = 0;
        for (int element : array) {
            sum += element;
        }
        for (int element : array) {
            if (element < sum / array.length) {
                System.out.print(element + " ");
            }
        }
        System.out.println();

    }

    static void step3(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }
        for (int i = array.length-1; i >= 0 ; i--) {
            if (array[i]==min) {
                System.out.print(i + " ");
            }
            
        }

    }

}

