package com.qst.chapter05.exercise02;

//继承Fruit类
public class Orange extends Fruit {
	public Orange(double weight, String color) {
		// 调用父类的构造方法
		super(weight, color);
	}

	// 重写toString()方法
	@Override
	public String toString() {
		return "这是一个桔子，" + super.toString();
	}
}
