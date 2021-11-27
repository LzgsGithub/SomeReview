package com.qst.chapter07;

import java.lang.reflect.Method;

//ʹ���Զ����@ MyAnno1ע��������
@MyAnno1(comment = "��ע��")
class MyClass1 {
	@MyAnno1(comment = "���������ķ���", order = 2)
	public void myMethod() {
	}
}

public class MyAnno1Demo {
	public static void main(String[] args) throws Exception {
		// ��ȡMyClass1��ע��
		MyAnno1 anno1 = MyClass1.class.getAnnotation(MyAnno1.class);
		// �����ע����Ϣ
		System.out.println("MyClass1���ע����ϢΪ��" + anno1.comment() + "�����"
				+ anno1.order());

		// ��ȡMyClass1���myMethod()����
		Method mth = MyClass1.class.getMethod("myMethod");
		// ��ȡmyMethod()������ע��
		MyAnno1 anno2 = mth.getAnnotation(MyAnno1.class);
		// �������ע�����Ϣ
		System.out.println("myMethod()������ע����ϢΪ��" + anno2.comment() + "�����"
				+ anno2.order());
	}
}
