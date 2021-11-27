package com.qst.chapter03.exercise01;

/**
 * @公司	QST青软实训
 * @作者	zhengjh
 */
public class BookDemo {
	public static void main(String[] args) {
		// 通过无参构造方法创建对象

		// Book book = new Book();
		// book.setName("JavaSE基础");
		// book.setPages(365);

		// 通过有参构造方法创建对象
		Book book = new Book("JavaSE基础", 365);
		
		System.out.println("书名：" + book.getName() + "\n页数：" + book.getPages());
	}

}
