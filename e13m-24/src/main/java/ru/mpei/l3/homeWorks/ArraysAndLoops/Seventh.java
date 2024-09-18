package ru.mpei.l3.homeWorks.ArraysAndLoops;

public class Seventh {
    public static void main(String[] arguments){
        int[] firstArray = {1,4,6,7,3};
        int[] secondArray = {3,7,4,2,4,7};
        int[] resultArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++){
            resultArray[i] = firstArray[i];
        }
        int j = 0;
        for (int i = firstArray.length; i < resultArray.length; i++){
            resultArray[i] = secondArray[j];
            j++;
        }

        System.out.print("[");
        for (int i = 0; i < resultArray.length; i++){
            if (i == resultArray.length - 1){
                System.out.print(resultArray[i]);
            } else {
                System.out.print(resultArray[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
