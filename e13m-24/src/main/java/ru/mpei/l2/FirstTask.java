package ru.mpei.l2;

public class FirstTask {
    public static void main(String[] args) {
        int[] array = {7, 6, 2, 5, 3};

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1- i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        double median = 0;
        int middleElement = array.length / 2;
        if (array.length % 2 == 0){
            median = (array[middleElement] + array[middleElement - 1]) / 2.0;
        } else {
            median = array[middleElement];
        }
        System.out.println();
        System.out.println(median);
    }
}
