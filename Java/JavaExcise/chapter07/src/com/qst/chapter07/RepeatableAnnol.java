package com.qst.chapter07;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface AnnolContents {// ��ע��������
	// ����value��Ա�������ó�Ա�����ɽ��ܶ��@RepeatableAnnolע��
	RepeatableAnnol[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(AnnolContents.class)
public @interface RepeatableAnnol {// ��ע������ظ�
	// Ϊ��ע�ⶨ��2����Ա����
	String name() default "����ʵѵ";

	int age();
}
