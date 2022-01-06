package com.company.javaproject;

public class Main {
    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Hero leesin = new Hero(10);
        Hero timor = new Hero(5);
        Hero Msf = new Hero(8);
        Hero gareen = new Hero(10);
        Healer sna = new Support("sna",10);
        KillThread k1 = new KillThread(leesin,timor);
        KillThread k2 = new KillThread(Msf,gareen);
        k1.start();
        k2.start();

        k1.join();
        k2.join();
    }
}
