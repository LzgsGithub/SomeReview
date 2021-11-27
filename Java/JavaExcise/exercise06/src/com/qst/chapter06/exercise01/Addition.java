package com.qst.chapter06.exercise01;

//加法运算类
public class Addition implements Operation {
	// 重写计算方法，进行加法运算
	@Override
	public double operation(double a, double b)
	{
		return a + b;
	}
}
