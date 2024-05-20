package tdd;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountNumber;

    private double balance;

    private double dailyWithdrawnLimit;

    private double dailyWithdrawnAmount;

    private List<String> history=new ArrayList<>();

    //param const

    public BankAccount(String accountNumber, double balance, double dailyWithdrawnLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dailyWithdrawnLimit = dailyWithdrawnLimit;
    }

    //getter-setter
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public Double getBalance(){
        return this.balance;
    }

    public Double getDailyWithdrawnLimit(){
        return this.dailyWithdrawnLimit;
    }

    public double getDailyWithdrawnAmount() {
        return dailyWithdrawnAmount;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDailyWithdrawnLimit(double dailyWithdrawnLimit) {
        this.dailyWithdrawnLimit = dailyWithdrawnLimit;
    }

    public void setDailyWithdrawnAmount(double dailyWithdrawnAmount) {
        this.dailyWithdrawnAmount = dailyWithdrawnAmount;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    //işlevsel metodlar
    //para yatırma
    public void deposit(double amount){

        if (amount>0){
            this.balance+=amount;
            this.history.add("Para yatırma : "+amount);
        }else {
            throw new RuntimeException("Miktar pozitif olmalı!");
        }

    }


    public boolean withdraw(double amount){

        if (amount>0 && amount<=this.balance && (this.dailyWithdrawnAmount+amount)<=this.dailyWithdrawnLimit){
            this.balance-=amount;
            this.dailyWithdrawnAmount+=amount;
            this.history.add("Para çekme : "+amount);
            return true;
        }

        return false;
    }

}