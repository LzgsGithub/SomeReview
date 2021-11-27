package com.qst.chapter02.exercise01;

/**
 * @公司  青软实训
 * @作者 guoqy
 */
public class WhileExc {
	public static void main(String[] args) {
		int year = 2000;
		while (year <= 2100) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println(year + "年");
			}
			year++;
		}
	}
}
