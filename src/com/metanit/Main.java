package com.metanit;
/*** Задать одномерный массив и найти в нем минимальный и максимальный
 элементы (без помощи интернета);*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert size of array:");
        int size = input.nextInt();
        int arr[] = new int [size];
        System.out.println("Insert elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }

        int max = -1000000;
        int min = 1000000;
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Here is maximum: " + max);
        System.out.println("Here is minimum: " + min);
    }
}
