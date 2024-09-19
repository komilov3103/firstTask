package ru.mpei.l3.homeWorks;

public class Number {
    private int number;

    public Number(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public boolean isPalindrome(){
        int reverse = 0;
        int temp = this.number;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }

        return (reverse == this.number);
    }

    public int sumOfNumbers(){
        int temp = this.number;
        int result = 0;
        while (temp != 0){
            result += temp % 10;
            temp = (temp - temp % 10) / 10;
        }
        return result;
    }
}
