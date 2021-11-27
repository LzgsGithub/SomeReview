package com.qst.chapter05.exercise02;

public class Fruit {
	double weight;// 重量
	String color;// 颜色

	public Fruit() {
		super();
	}

	public Fruit(double weight, String color) {
		this.weight = weight;
		this.color = color;
	}

	// 重写toString()方法
	@Override
	public String toString() {
		return "重：" + this.weight + "kg  " + "颜色是" + this.color;
	}
}
