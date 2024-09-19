package ru.mpei.l3.homeWorks;

public class BankAccount {

    private int money;

    public int checkMoney(){
        return this.money;
    }

    public void putMoney(int quantity){
        this.money += quantity;
    }

    public int withdrawMoney(){
        int temp = this.money;
        this.money = 0;
        return temp;
    }

    public double checkInDollars(){
        return this.money/ExchangeRates.getDollarRate();
    }

    public double checkInEuro(){
        return this.money/ExchangeRates.getEuroRate();
    }

}
