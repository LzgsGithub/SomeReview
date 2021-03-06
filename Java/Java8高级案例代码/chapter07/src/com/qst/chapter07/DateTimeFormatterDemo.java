package com.qst.chapter07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterDemo {

	// 日期和时间的格式化
	public static void formateMethod() {
		DateTimeFormatter[] formatters = new DateTimeFormatter[] {
				// 直接使用常量创建DateTimeFormatter格式器
				DateTimeFormatter.ISO_LOCAL_DATE,
				DateTimeFormatter.ISO_LOCAL_TIME,
				DateTimeFormatter.ISO_LOCAL_DATE_TIME,
				// 使用本地化的不同风格来创建DateTimeFormatter格式器
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,
						FormatStyle.MEDIUM),
				DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
				// 根据模式字符串来创建DateTimeFormatter格式器
				DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss") };
		LocalDateTime date = LocalDateTime.now();
		// 依次使用不同的格式器对LocalDateTime进行格式化
		for (int i = 0; i < formatters.length; i++) {
			// 下面两行代码的作用相同
			System.out.println(date.format(formatters[i]));
			System.out.println(formatters[i].format(date));
		}
	}

	// 解析字符串，成为日期和时间
	public static void parseMethod() {
		// 定义一个任意格式的日期时间字符串
		String str1 = "2015==12==02 01时06分09秒";
		// 根据需要解析的日期、时间字符串定义解析所用的格式器
		DateTimeFormatter fomatter1 = DateTimeFormatter
				.ofPattern("yyyy==MM==dd HH时mm分ss秒");
		// 执行解析
		LocalDateTime dt1 = LocalDateTime.parse(str1, fomatter1);
		System.out.println(dt1); // 输出 2015-12-02T01:06:09
		// ---下面代码再次解析另一个字符串---
		String str2 = "2015$$$十二月$$$02 20小时";
		DateTimeFormatter fomatter2 = DateTimeFormatter
				.ofPattern("yyy$$$MMM$$$dd HH小时");
		LocalDateTime dt2 = LocalDateTime.parse(str2, fomatter2);
		System.out.println(dt2); // 输出 2015-12-02T20:00
	}

	public static void main(String[] args) {
		// 调用格式化方法
		formateMethod();
		// 调用解析方法
		parseMethod();
	}

}
