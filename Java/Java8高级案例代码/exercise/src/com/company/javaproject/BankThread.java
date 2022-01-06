package com.company.javaproject;

public class BankThread implements Runnable{
    private BankAccount acc;
    private String Tname;
    private double money;

    public BankThread(){}
    public BankThread(BankAccount acc,String Tname,double money){
        this.acc = acc;
        this.Tname = Tname;
        this.money = money;
    }

    public BankAccount getAcc() {
        return acc;
    }

    public void setAcc(BankAccount acc) {
        this.acc = acc;
    }

    public String getTName() {
        return Tname;
    }

    public void setTName(String Tname) {
        this.Tname = Tname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void run(){
        synchronized(this.acc){
            double d = acc.getBalance();
            if(money<0 && d<-money ){
                System.out.println(acc.getBankNo().toString()+"余额不足，请及时充值！");
            }
            else{
                d+=money;
                System.out.println(acc.getBankNo().toString()+"操作成功，现余额为："+d);
                acc.setBalance(d);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        BankAccount a = new BankAccount("06191915",7000);
        Thread t1 = new Thread(new BankThread(a,"t001",-2000));
        Thread t2 = new Thread(new BankThread(a,"t002",-4000));
        Thread t3 = new Thread(new BankThread(a,"t003",2000));
        Thread t4 = new Thread(new BankThread(a,"t004",3500));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println(a.getBankNo().toString()+"账户，现余额为："+a.getBalance());
    }

}
