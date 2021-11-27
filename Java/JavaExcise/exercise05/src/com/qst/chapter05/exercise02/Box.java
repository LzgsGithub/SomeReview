package com.qst.chapter05.exercise02;

//水果箱
public class Box {
	// 定义一个数组用来存储Fruit对象
	private Fruit[] box = new Fruit[10];

	public Box() {
		super();
	}

	// 添加水果
	public void addFruit(Fruit fruit) {
		for (int i = 0; i < box.length; i++) {
			if (box[i] == null) {
				box[i] = fruit;
				break;
			}
		}
	}

	// 取出水果
	public Fruit getFruit(Fruit fruit) {
		for (int i = 0; i < box.length; i++) {
			if (box[i] == fruit) {
				box[i] = null;
				return fruit;
			}
		}
	
		return null;
	}

	// 显示盒子中的所有水果
	public void showBox() {
		System.out.println("==============显示盒子中的水果=================");
		for (Fruit fruit : box) {
			if (fruit != null) {
				System.out.println(fruit.toString());
			}
		}
		System.out.println("==============   显示结束     =================");
	}
}
