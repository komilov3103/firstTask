package ru.mpei.l3.homeWorks.ArraysAndLoops;

public class Fourth {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 7, 3, 0, 32, 2, 1, 0};

        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
