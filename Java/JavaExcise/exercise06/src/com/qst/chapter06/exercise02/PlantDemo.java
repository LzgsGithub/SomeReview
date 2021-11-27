package com.qst.chapter06.exercise02;

public class PlantDemo {
	public static void main(String[] args) {
		Fruit apple = new Apple();
		Fruit strawberry = new Strawberry();
		apple.planted();// 种植苹果
		strawberry.planted();// 种植草莓
	}
}
