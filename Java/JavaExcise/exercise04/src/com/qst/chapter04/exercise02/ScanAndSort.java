package com.qst.chapter04.exercise02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @公司 QST青软实训
 * @作者 zhengjh
 */
public class ScanAndSort {
	public static void main(String[] args) {
		// 定义一个数组，用来存储接收到的10个数
		int[] array = new int[10];
		// 创建Scanner流对象，从键盘接收流
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入10个整数：");
		for (int i = 0; i < 10; i++) {
			// 从键盘接收整数，并赋值给数组
			array[i] = scanner.nextInt();
		}
		scanner.close();
		/**
		 * 方法一，使用Arrays类的sort()方法进行排序
		 */
		// Arrays.sort(array);
		/**
		 * 方法二，使用直接选择排序进行排序，也可使用其他排序方法
		 */
		array = selectSort(array);

		for (int i : array) {
			System.out.println(i + " ");
		}
	}

	// 简单的选择排序
	private static int[] selectSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];// 最小数中间变量
			int index = i; // 最小数的索引
			for (int j = i + 1; j < array.length; j++) {
				// 找出最小的数
				if (array[j] < temp) {
					temp = array[j];
					index = j;
				}
			}
			// 变换最小数在数组中的位置
			array[index] = array[i];
			array[i] = temp;
		}
		return array;
	}
}
