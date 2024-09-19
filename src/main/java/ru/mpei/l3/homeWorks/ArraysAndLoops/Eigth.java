package ru.mpei.l3.homeWorks.ArraysAndLoops;

import java.util.Scanner;

public class Eigth {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String input){
        for (int i = 0; i < input.length() / 2; i++){
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)){
                return false;
            }
        }

        return true;
    }
}
