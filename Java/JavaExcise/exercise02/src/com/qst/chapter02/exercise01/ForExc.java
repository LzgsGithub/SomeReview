package com.qst.chapter02.exercise01;

/**
 * @公司 青软实训
 * @作者 guoqy
 */
public class ForExc {

	public static void main(String[] args) {
		// 控制图形大小
		int size = 7;
		// 1.输出三角形
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= (size - i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2.输出菱形就是输出正三角和到倒三角
		// （1）输出正三角
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		// （2）输出倒三角
		for (int i = 1; i <= size - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 2 * (size - 1); k >= 2 * i; k--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
