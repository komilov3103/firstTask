package ru.mpei.l2;

public class FirstTask {
    public static void main(String[] args) {
        int[] array = {5, 1, 9, 8, 11, 3};

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - 1- i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];

                }
            }
        }
    }
}
