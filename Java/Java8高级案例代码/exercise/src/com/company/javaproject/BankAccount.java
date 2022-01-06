package com.company.javaproject;

public class BankAccount {
    private String BankNo;
    private double balance;

    public BankAccount(){}
    public BankAccount(String BankNo,double balance){
        this.BankNo = BankNo;
        this.balance = balance;
    }

    public String getBankNo() {
        return BankNo;
    }

    public void setBankNo(String bankNo) {
        BankNo = bankNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
