package ru.mpei.l3.homeWorks.ArraysAndLoops;

public class Ninth {
    public static void main(String[] args){
        double[] randomArray = new double[10];
        double maxElement = randomArray[0];
        double minElement = randomArray[0];
        double average = 0;
        double sum = 0;

        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = Math.random();
        }

        for (int i = 0; i < randomArray.length; i++){
            if (randomArray[i] > maxElement){
                maxElement = randomArray[i];
            } else if (randomArray[i] < minElement){
                minElement = randomArray[i];
            }
            sum += randomArray[i];
        }

        System.out.print("[");
        for (int i = 0; i < randomArray.length; i++){
            if (i == randomArray.length - 1){
                System.out.print(randomArray[i]);
            } else {
                System.out.print(randomArray[i] + ", ");
            }
        }
        System.out.println("]");

        System.out.println("Max element: " + maxElement);
        System.out.println("Min element: " + minElement);
        System.out.println("Average element: " + sum / randomArray.length);


    }
}
