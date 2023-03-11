package org.example.hw4;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Hw4 {
    //3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] / 10 != 0) {
                count = count + i;
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = count;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
