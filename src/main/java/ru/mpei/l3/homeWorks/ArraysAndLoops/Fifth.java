package ru.mpei.l3.homeWorks.ArraysAndLoops;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scan.nextInt();
        boolean containsZero = false;

        for (int i = N; i > 0; i = i / 10){
            if (i % 10 == 0) {
                containsZero = true;
                break;
            }
        }

        System.out.println(containsZero);
    }
}
