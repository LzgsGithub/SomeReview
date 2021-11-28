package com.qst.chapter07;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		// ��Ҫ��ʽ��������
		double value = 987654.321;
		// �趨����Locale
		Locale cnLocale = new Locale("zh", "CN");
		Locale usLocale = new Locale("en", "US");
		// �¹�
		Locale deLocal3 = new Locale("de", "DE");
		NumberFormat dNf = NumberFormat.getNumberInstance();
		NumberFormat pNf = NumberFormat.getPercentInstance();
		// �õ�����local��Ӧ��NumberFormat����
		NumberFormat cnNf = NumberFormat.getNumberInstance(cnLocale);
		NumberFormat usNf = NumberFormat.getNumberInstance(usLocale);
		NumberFormat deNf = NumberFormat.getNumberInstance(deLocal3);
		// ���ϱߵ�double���ݸ�ʽ�����
		System.out.println("Default Percent Format:" + pNf.format(value));
		System.out.println("Default Number Format:" + dNf.format(value));
		System.out.println("China Number Format:" + cnNf.format(value));
		System.out.println("United Number Format:" + usNf.format(value));
		System.out.println("German Number Format:" + deNf.format(value));
		try {
			System.out.println(dNf.parse("3.14").doubleValue());
			System.out.println(dNf.parse("3.14F").doubleValue());
			// ��������׳��쳣
			System.out.println(dNf.parse("F3.14").doubleValue());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}