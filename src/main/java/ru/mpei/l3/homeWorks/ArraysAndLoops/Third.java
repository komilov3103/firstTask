package ru.mpei.l3.homeWorks.ArraysAndLoops;

import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        long N = scan.nextInt();

        for (long i = 0; i <= N; i++){
            System.out.println(Math.pow(2, i));
        }
    }
}
