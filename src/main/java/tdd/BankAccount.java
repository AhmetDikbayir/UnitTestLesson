package tdd;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private double dailyWithDrawnLimit;

    private double dailyWithDrawnAmount;

    private List<String> history = new ArrayList<>();

    public BankAccount(String accountNumber, double balance, double dailyWithDrawnLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dailyWithDrawnLimit = dailyWithDrawnLimit;
    }

    //getter-setter
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public Double getBalance(){
        return this.balance;
    }

    public Double getDailyWithdrawnLimit(){
        return this.dailyWithDrawnLimit;
    }

    public double getDailyWithDrawnAmount() {
        return dailyWithDrawnAmount;
    }

    public void setDailyWithDrawnAmount(double dailyWithDrawnAmount) {
        this.dailyWithDrawnAmount = dailyWithDrawnAmount;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDailyWithDrawnLimit(double dailyWithDrawnLimit) {
        this.dailyWithDrawnLimit = dailyWithDrawnLimit;
    }
}
