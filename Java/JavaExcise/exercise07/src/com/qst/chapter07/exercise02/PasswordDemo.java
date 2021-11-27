package com.qst.chapter07.exercise02;

import java.util.Scanner;

/**
 * @公司 QST青软实训
 * @作者 zhengjh
 */
public class PasswordDemo {
	public static void main(String[] args) {
		// 创建键盘接收流
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入密码：");
		String password = scanner.nextLine();
		scanner.close();
		// 如果密码不符合规范，抛出异常
		try {
			if (password.length() > 10 || password.length() < 6) {
				throw new PasswordException("密码长度不符合规范，请输入一个长度为6-10位的密码");
			}
		} catch (PasswordException e) {
			e.printStackTrace();
		}
	}
}
