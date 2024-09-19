package ru.mpei.l3.homeWorks.ArraysAndLoops;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        String[] months = {"January", "Fabuary", "March", "April", "May",
                            "June", "July", "August", "September", "October", "November", "December"};
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while (input <= 0 || input > 12){
            System.out.println("Неверный ввод!");
            input = scan.nextInt();
        }

        System.out.println("Month " + input + " is " + months[input - 1]);

//        if (input / 4 == 4 )
    }

}
