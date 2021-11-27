package com.qst.chapter06.exercise02;

public class Apple extends Fruit {
	// 重写抽象方法
	@Override
	public void planted() {
		System.out.println("**********************");
		System.out.println("种植苹果");
		System.out.println("**********************");
	}

}
