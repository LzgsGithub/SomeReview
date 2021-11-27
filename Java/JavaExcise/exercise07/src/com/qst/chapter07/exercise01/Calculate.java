package com.qst.chapter07.exercise01;

public class Calculate {
	double num1;
	double num2;

	public Calculate(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	// 加法
	public double add() {
		return num1 + num2;
	}

	// 减法
	public double sub() {
		return num1 - num2;
	}

	// 乘法
	public double mult() {
		double product = num1 * num2;
		return product;
	}

	// 除法
	public double div()  {
		double quotient =0;
		try {
			quotient = num1 / num2;
			
		} catch (Exception e) {
			System.out.println("除法运算出现异常，被除数不能为0！");
		}
		return quotient;
	}
}
