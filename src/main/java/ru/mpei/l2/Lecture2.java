package ru.mpei.l2;

public class Lecture2 {
    public static void main(String[] args) {
        int variable = 5;
        for (; variable < 35; ) {
            variable += 5;
        }

        for (String var : args) {
            System.out.println(var);
        }
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("This is good number!");
                break;
            case 2:
                System.out.println("Not good number");
                number = 22;
                break;
        }

        double[] numbersDouble = new double[3];
        int[] numberInt = {1, 2, 3, 4};
        String[] arrayStrings = new String[]{"Komil", "Dilovar", "some"};
        for (String var : arrayStrings) {
            System.out.println(var);
        }

        double result = Math.sqrt(number);
        System.out.println(result);

        int k = 0;
        k++;

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0 && i == 2) {
                continue;
            } else if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
