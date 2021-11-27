package com.qst.chapter06.exercise01;

public class OperationDemo {
	public static void main(String[] args) {
		double a= 10;
		double b=2;
		System.out.println("a="+a+",b="+b);
		System.out.println("===================="+ "==");
		
		Addition  ope = new Addition();
		System.out.println("a+b="+ope.operation(a, b));
		
		Subtraction ope1 = new Subtraction();
		System.out.println("a-b="+ope.operation(a, b));
		
		Multiplication ope2 = new Multiplication();
	    System.out.println("a*b="+ope.operation(a, b));
	
	    Division ope3 = new Division();
		System.out.println("a/b="+ope.operation(a, b));
	}
}
