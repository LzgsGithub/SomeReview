package com.qst.chapter05.exercise01;

public class HumanDemo {
	public static void main(String[] args) {
		Human teacher = new Teacher("张三", 43, "男", "t1103", "JavaSE基础");
		teacher.duty();
		teacher.toPrint();
		System.out.println("=========================================");
		Human student = new Student("李四", 19, "女", "s150922", "JavaSE基础", 89);
		student.duty();
		student.toPrint();
	}
}
