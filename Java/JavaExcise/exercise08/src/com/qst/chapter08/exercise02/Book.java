package com.qst.chapter08.exercise02;

import java.sql.Date;

/**
 * @公司 QST青软实训
 * @作者 zhengjh
 */
public class Book implements Comparable<Book> {// 实现Comparable接口
	private String name;// 书名
	private Integer price;// 价格
	private Date date;// 出版日期

	public Book() {
		super();
	}

	public Book(String name, int price, Date date) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
	}

	// get和set方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	// 根据价格进行比较
	@Override
	public int compareTo(Book book) {
		return this.getPrice().compareTo(book.getPrice());
	}
}
