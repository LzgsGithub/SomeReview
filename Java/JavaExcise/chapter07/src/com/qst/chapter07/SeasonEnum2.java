package com.qst.chapter07;

//�����췽����ö����
public enum SeasonEnum2 {
	// �ڵ�һ���г�4��ö��ʵ��:�����ġ����
	SPRING("��"), SUMMER("��"), FALL("��"), WINTER("��");
	// ����һ������
	private String name;

	// ���췽��
	SeasonEnum2(String name) {
		this.name = name;
	}

	// ����
	public String toString() {
		return this.name;
	}
}
