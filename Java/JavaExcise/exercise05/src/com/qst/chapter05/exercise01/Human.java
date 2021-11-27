package com.qst.chapter05.exercise01;

public class Human {
	// 定义人类的属性
	 String name;// 姓名
	int age;// 年龄
	String sex;// 性别

	public Human() {

	}



	// 带参数的构造方法
	public Human(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// 有一个方法职责
	public void duty() {
		System.out.println("职责！");
	}

	// 打印基本信息
	public void toPrint() {
		System.out.println("姓名：" + this.name + "\t年龄：" + this.age + "\t性别："
				+ this.sex);
	}
}
