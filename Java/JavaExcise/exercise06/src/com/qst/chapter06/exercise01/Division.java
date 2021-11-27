package com.qst.chapter06.exercise01;

//除法运算类
public class Division implements Operation {
	// 重写计算方法，进行除法运算
	@Override
	public double operation(double a, double b) {
		return a / b;
	}

}
