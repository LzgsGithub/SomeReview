package com.qst.chapter04.exercise01;

import java.util.Arrays;

/**
 * @公司 QST青软实训
 * @作者 zhengjh
 */
public class RandomAndSort {
	public static void main(String[] args) {
		// 定义整形数组array用于存放随机数
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {

			// 使用Math.random()方法获得随机数
			int a = (int) (Math.random() * 100 + 1);

			array[i] = a;
		}

		/**
		 * 方法一，使用系统提供的类Arrays的sort()方法排序
		 */
		// Arrays.sort(array);

		/**
		 * 方法二，调用冒泡排序法排序，也可使用其他排序方法
		 */
		array = bubbleSort(array);

		// 输出array数组
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	// 冒泡排序法
	private static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					// 交换两数的位置
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
