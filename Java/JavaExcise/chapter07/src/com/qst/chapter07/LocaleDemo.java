package com.qst.chapter07;

import java.util.Locale;

public class LocaleDemo {

	public static void main(String[] args) {
		// ����Java��֧�ֵ�ȫ�����Һ����Ե�����
		Locale[] localeList = Locale.getAvailableLocales();
		// ���������ÿ��Ԫ�أ����λ�ȡ��֧�ֵĹ��Һ�����
		for (int i = 0; i < localeList.length ; i++ )
		{
			// �������֧�ֵĹ��Һ�����
			System.out.println(localeList[i].getDisplayCountry()
				+ "=" + localeList[i].getCountry()+ " "
				+ localeList[i].getDisplayLanguage()
				+ "=" + localeList[i].getLanguage());
		}
		// ��ȡȱʡLocale��Ϣ
		Locale locale = Locale.getDefault();
		// ���Դ���
		System.out.println("Language        : " + locale.getLanguage());
		// ���Ҵ���
		System.out.println("Country         : " + locale.getCountry());
		// ������ʾ����
		System.out.println("DisplayLanguage : " + locale.getDisplayLanguage());
		// ������ʾ����
		System.out.println("DisplayCountry  : " + locale.getDisplayCountry());
		System.out.println("locale : " + locale);
		Locale newLocale = new Locale("en", "US");
		// ����ȱʡLocale��Ϣ
		Locale.setDefault(newLocale);
		locale = Locale.getDefault();
		System.out.println("Language        : " + locale.getLanguage());
		System.out.println("Country         : " + locale.getCountry());
		System.out.println("DisplayLanguage : " + locale.getDisplayLanguage());
		System.out.println("DisplayCountry  : " + locale.getDisplayCountry());
		System.out.println("locale : " + locale);
	}

}
