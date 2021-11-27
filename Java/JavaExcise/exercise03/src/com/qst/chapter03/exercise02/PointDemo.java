package com.qst.chapter03.exercise02;

/**
 * @公司 QST青软实训
 * @作者 zhengjh
 */
public class PointDemo {
	public static void main(String[] args) {
		// 创建两个点p1，p2
		Point p1 = new Point(50, 50);
		Point p2 = new Point(100, 100);
		
		// 调用静态方法distance()计算两点之间的距离
		double distance = distance(p1, p2);
		
		System.out.println("两点之间的距离为：" + distance);
	}

	// 计算两点之间的距离
	private static double distance(Point p1, Point p2) {
		// 计算两点之间横坐标的差
		double xDifference = Math.abs(p1.getX() - p2.getX());
		// 计算两点之间纵坐标的差
		double yDifference = Math.abs(p1.getY() - p2.getY());
		// 计算两点之间的距离
		double distance = Math.sqrt(xDifference * xDifference + yDifference
				* yDifference);
		return distance;

	}
}
