package com.qst.chapter07;

//ʹ���Զ����@InheritedAnnolע�����ε�Base��
@InheritedAnnol(comment = "�̳�ע��", order = 2)
class Base {
}

// InheritedDemo��ֻ�Ǽ̳���Base�࣬
// ��δֱ��ʹ��@InheritedAnnolע�����Σ�
// ��@InheritedAnnolע�ⱻ@InheritedԪע�����Σ�
// ����Base������඼Ĭ�ϱ�@InheritedAnnol����
public class InheritedDemo extends Base {
	public static void main(String[] args) {
		// ��InheritedDemo�л�ȡInheritedAnnolע����Ϣ
		InheritedAnnol anno = InheritedDemo.class
				.getAnnotation(InheritedAnnol.class);
		// ���InheritedAnnolע���Ա��Ϣ
		System.out.println(anno.comment() + ":" + anno.order());
		// ��ӡInheritedDemo���Ƿ����@InheritedAnnol����
		System.out.println(InheritedDemo.class
				.isAnnotationPresent(InheritedAnnol.class));
	}
}
