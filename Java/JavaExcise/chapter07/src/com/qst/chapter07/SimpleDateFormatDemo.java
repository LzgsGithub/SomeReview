package com.qst.chapter07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf1.format(now));
		SimpleDateFormat sdf2 = 
		new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		System.out.println(sdf2.format(now));
		SimpleDateFormat sdf3 = 
		new SimpleDateFormat("������ yyyy�� MM �� dd �գ��ǽ���ĵ� D ��");
		System.out.println(sdf3.format(now));
	}

}
