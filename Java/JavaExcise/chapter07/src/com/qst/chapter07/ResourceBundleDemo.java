package com.qst.chapter07;

import java.util.Locale;
import java.util.ResourceBundle;

//���ʻ���Դ�󶨲��� 
public class ResourceBundleDemo {

	public static void main(String[] args) {
		// ��ȡĬ����Դ�ļ�����LocalĬ��ֵ�й�
		ResourceBundle resb1 = ResourceBundle.getBundle("myres",
				Locale.getDefault());
		System.out.println(resb1.getString("title"));
		System.out.println(resb1.getString("name"));
		System.out.println("-----------------------------");

		Locale localeEn = new Locale("en", "US");
		// Ӣ����Դ�ļ�myres_en_US.properties
		ResourceBundle resb2 = ResourceBundle.getBundle("myres", localeEn);
		System.out.println(resb2.getString("title"));
		System.out.println(resb2.getString("name"));
		System.out.println("-----------------------------");

		// ������Դ�ļ�myres_zh_CN.properties
		Locale localeZh = new Locale("zh", "CN");
		ResourceBundle resb3 = ResourceBundle.getBundle("myres", localeZh);
		System.out.println(resb1.getString("title"));
		System.out.println(resb1.getString("name"));
		System.out.println("-----------------------------");
	}

}
