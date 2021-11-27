package com.qst.chapter07;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;

public class MessageFormatDemo {

	/**
	 * ������Ϣ��ʽ������msgFormat()
	 * 
	 * @param pattern
	 *            ģʽ�ַ���
	 * @param locale
	 *            ���Ի���
	 * @param msgParams
	 *            ռλ������
	 */
	public static void msgFormat(String pattern, Locale locale,
			Object[] msgParams) {
		// ����ָ����patternģʽ�ַ�������MessageFormat����
		MessageFormat formatter = new MessageFormat(pattern);
		// formatter.applyPattern(pattern);
		// �������Ի���
		formatter.setLocale(locale);
		// ���ݴ��ݵĲ�������Ӧ�滻ģʽ���е�ռλ��
		System.out.println(formatter.format(msgParams));
	}

	public static void main(String[] args) {
		// ����һ����ռλ����ģʽ�ַ���
		String pattern1 = "{0},����!��ӭ����{1}���ʱ�ϵͳ��";
		// ��ȡĬ�����Ի���
		Locale locale1 = Locale.getDefault();
		// �������
		System.out.println(locale1.getCountry());
		// ����ģʽ������Ķ�������
		Object[] msgParams1 = { "�Կ���", new Date() };
		// ����msgFormat()ʵ����Ϣ��ʽ�����
		msgFormat(pattern1, locale1, msgParams1);

		// ����һ����ռλ����ģʽ�ַ���,��ռλ�����в�ͬ�ĸ�ʽ��
		String pattern2 = "{0} ,���!��ӭ����{1,date,long}���ʱ�ϵͳ,������{1,time,hh:mm:ss}";
		// ����msgFormat()ʵ����Ϣ��ʽ�����
		msgFormat(pattern2, locale1, msgParams1);

		System.out.println("--------------------------------------");
		// ����һ�����Ի���
		Locale locale2 = new Locale("en", "US");
		// �������
		System.out.println(locale2.getCountry());
		// ����ģʽ������Ķ�������
		Object[] msgParams2 = { "QST����ʵѵ", new Date() };
		// ����msgFormat()ʵ����Ϣ��ʽ�����
		msgFormat(pattern1, locale2, msgParams2);
		msgFormat(pattern2, locale2, msgParams2);
	}

}
