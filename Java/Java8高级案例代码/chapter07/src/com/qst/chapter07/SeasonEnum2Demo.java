package com.qst.chapter07;

public class SeasonEnum2Demo {
	public static void main(String[] args) {
		System.out.println("SeasonEnum2ö���������ʵ��ֵ��");
		// ö����Ĭ����һ��values���������ظ�ö���������ʵ��ֵ
		for (SeasonEnum2 s : SeasonEnum2.values()) {
			System.out.println(s);
		}
		System.out.println("---------------------");

		// ʹ��valueOf()������ȡָ����ʵ��
		SeasonEnum2 se = SeasonEnum2.valueOf("SUMMER");
		// ���se
		System.out.println(se);
		// ����judge()����
		judge(se);
		System.out.println("---------------------");

		// ����һ��ö�������,��ֱ�Ӹ�ֵ
		SeasonEnum2 season = SeasonEnum2.WINTER;
		// ���season
		System.out.println(season);

		// ����judge()����
		judge(season);

	}

	// �жϼ��ڲ����
	private static void judge(SeasonEnum2 season) {
		// ʹ��switch����ж�ö��ֵ
		switch (season) {
		case SPRING:
			System.out.println("��ů����������̤��");
			break;
		case SUMMER:
			System.out.println("�������ף��ʺ���Ӿ");
			break;
		case FALL:
			System.out.println("�����ˬ��������ʱ");
			break;
		case WINTER:
			System.out.println("����ѩƮ��Χ¯��ѩ");
			break;
		}
	}

}
