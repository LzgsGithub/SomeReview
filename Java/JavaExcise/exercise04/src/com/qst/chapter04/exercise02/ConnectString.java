package com.qst.chapter04.exercise02;

import java.util.Scanner;

/**
 * @公司 QST青软实训
 * @作者 zhengjh
 */
public class ConnectString {
	public static void main(String[] args) {
		// 创建Scanner流对象，从键盘接收流
		Scanner scanner = new Scanner(System.in);
		// 定义StringBuffer类对象
		StringBuffer buffer = new StringBuffer();
		for (int i = 1; i <= 5; i++) {
			System.out.printf("请输第%d个字符串：\n", i);
			// 从键盘接收字符串
			String string = scanner.next();
			// 将接收到的新的字符串追加到buffer的后面
			buffer.append(string);
		}
		scanner.close();
		System.out.println("得到的字符串为：" + buffer);
	}
}
