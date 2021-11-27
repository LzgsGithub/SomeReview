package com.qst.chapter07;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;

class MyClass {
	public void setName(String name) {
	}

	public void display(String str, List<String> list) {
	}
}

public class MethodParameterDemo {
	public static void main(String[] args) throws Exception {
		// ��ȡMyClass�������
		Class<MyClass> clazz = MyClass.class;
		// ��ȡMyClass�������public����
		Method[] mtds = clazz.getMethods();
		for (Method m : mtds) {
			// ���������
			System.out.println("��������" + m.getName());
			// ����÷�����������
			System.out.println("����������" + m.getParameterCount());
			// ��ȡ�÷������в���
			Parameter[] parameters = m.getParameters();
			int index = 1;
			// �������в����������������Ϣ
			for (Parameter p : parameters) {
				if (p.isNamePresent()) {
					System.out.println("---��" + index++ + "��������Ϣ---");
					System.out.println("��������" + p.getName());
					System.out.println("�β����ͣ�" + p.getType());
					System.out.println("�������ͣ�" + p.getParameterizedType());
				}
			}
			System.out
					.println("----------------------------------------------");

		}
	}
}
