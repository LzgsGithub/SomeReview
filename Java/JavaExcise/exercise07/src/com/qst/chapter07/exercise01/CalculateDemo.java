package com.qst.chapter07.exercise01;

import java.util.Scanner;

/**
 * @公司 QST青软实训
 * @作者 zhengjh
 */
public class CalculateDemo {
	public static void main(String[] args) {
		// 创建键盘接收流
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用于计算的两个数：");
		// 从键盘接收两个double类型的浮点数
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();

		scanner.close();
		// 使用带参数的构造方法创建计算器对象
		Calculate calculate = new Calculate(num1, num2);
		double add = calculate.add();// 求和
		double sub = calculate.sub();// 求差
		double mult = calculate.mult();// 求积
		double div = calculate.div();// 求商
		System.out.println("========================");
		System.out.println(num1+"+"+num2+"="+add );
		System.out.println(num1+"-"+num2+"="+sub );
		System.out.println(num1+"*"+num2+"="+mult );
		System.out.println(num1+"/"+num2+"="+div );
	}

}