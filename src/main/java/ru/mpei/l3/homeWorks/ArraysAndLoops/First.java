package ru.mpei.l3.homeWorks.ArraysAndLoops;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        for (int i = input.length() - 1; i >= 0; i--){
            System.out.println(input.charAt(i));
        }
    }
}
