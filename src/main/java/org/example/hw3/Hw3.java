package org.example.hw3;

import java.util.Scanner;



public class Hw3 {

    //2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(CheckArray(array));
}

    public static boolean CheckArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}
