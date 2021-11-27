package com.qst.chapter03.exercise02;

/**
 * @公司	QST青软实训
 * @作者	zhengjh
 */
public class Point {
	// Point类的两个属性
	private double x;//x表示横坐标
	private double y;//y表示纵坐标

	// 无参构造方法
	public Point() {

	}

	// 有参数的构造方法
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// get和set方法
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}
