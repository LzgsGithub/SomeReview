package com.qst.chapter05.exercise01;

//继承Human类
public class Student extends Human {
	String sno;// 学号
	String major;// 专业
	int grade;// 成绩

	public Student() {
		super();
	}

	// 带参数的构造方法
	public Student(String name, int age, String sex, String sno, String major,
			int grade) {
		// 调用父类的构造方法
		super(name, age, sex);
		// 为子类变量赋值
		this.sno = sno;
		this.major = major;
		this.grade = grade;
	}

	// 重写职责方法
	@Override
	public void duty() {
		System.out.println("学生的任务是：好好学习！");
	}

	// 重写打印方法
	@Override
	public void toPrint() {
		// 调用父类打印方法
		super.toPrint();
		System.out.println("学号：" + this.sno + "\t专业：" + this.major + "\t成绩："
				+ this.grade);
	}
}
