package com.qst.chapter04.exercise01;

/**
 * @公司 QST青软实训
 * @作者 zhengjh
 */
public class LotteryDemo {
	public static void main(String[] args) {
		// 定义一个数组，用来存储取出来的5个数
		int[] lottery = new int[5];
		// 调用生成随机数并判断的方法
		lottery = createAndJudge(lottery);
		for (int i : lottery) {
			System.out.println(i + " ");
		}
	}

	// 生成随机数并判断
	private static int[] createAndJudge(int[] array) {
		for (int i = 0; i < array.length; i++) {
			// 生成1-23随机数
			array[i] = (int) (Math.random() * 23 + 1);
			// 开始判断
			for (int j = 0; j < i; j++) {
				// 如果新生成的随机数重复了i--继续循环
				if (array[i] == array[j]) {
					i--;
					continue;
				}
			}
		}
		return array;
	}
}
