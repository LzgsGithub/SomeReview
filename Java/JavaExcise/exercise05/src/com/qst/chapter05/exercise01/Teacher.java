package com.qst.chapter05.exercise01;

//继承Human类
public class Teacher extends Human {
	String tno;// 教师职工号
	String subject;// 所任学科

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String sex, String tno, String subject) {
		// 使用super关键字调用父类构造方法
		super(name, age, sex);
		// 为子类变量赋值
		this.tno = tno;
		this.subject = subject;
	}

	// 重写职责方法
	@Override
	public void duty() {
		System.out.println("教师职责是：教书育人！");
	}

	// 重写打印方法
	@Override
	public void toPrint() {
		// 调用父类的打印方法
		super.toPrint();
		System.out.println("教师职工号：" + this.tno + "\t所任学科：" + this.subject);
	}
}
