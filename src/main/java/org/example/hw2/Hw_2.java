package org.example.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Hw_2 {
    //1) Дана последовательность N целых чисел. Найти сумму простых чисел.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(SumSimpleNumber(n));
    }



    public static int SumSimpleNumber(int x) {
        int count = 0;
        for (int i = 0; i < x; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                   k++;
                }
            }
            if (k == 2) {
                count = count + i;
            }
        }
        return count;
    }
}
