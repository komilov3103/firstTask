package ru.mpei.l3.homeWorks.ArraysAndLoops;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scan.nextInt();
        int[] numbersArray = new int[100];
        int arrayLength = 0;

        for (; N > 0; arrayLength++){
            numbersArray[arrayLength] = N % 10;
            N = (N - (N % 10)) / 10;
        }

        System.out.print("[");
        for (int i = arrayLength - 1; i >= 0; i--){
            if (i == 0){
                System.out.print(numbersArray[i]);
            } else {
                System.out.print(numbersArray[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
