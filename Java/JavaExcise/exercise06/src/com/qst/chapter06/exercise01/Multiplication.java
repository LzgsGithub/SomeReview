package com.qst.chapter06.exercise01;

//乘法运算类
public class Multiplication implements Operation {
	// 重写计算方法，进行乘法运算
	@Override
	public double operation(double a, double b) {
		return a * b;
	}

}
