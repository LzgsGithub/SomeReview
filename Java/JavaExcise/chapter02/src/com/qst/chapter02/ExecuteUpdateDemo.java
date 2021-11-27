package com.qst.chapter02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdateDemo {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String user = "scott";
	private String pass = "zkl123";

	public void createTable(String sql) throws Exception {
		// 加载驱动
		Class.forName(driver);
		try (
		// 获取数据库连接
		Connection conn = DriverManager.getConnection(url, user, pass);
				// 使用Connection来创建一个Statment对象
				Statement stmt = conn.createStatement()) {
			// 执行DDL,创建数据表
			stmt.executeUpdate(sql);
		}
	}

	public long insertData(String sql) throws Exception {
		// 加载驱动
		Class.forName(driver);
		try (
		// 获取数据库连接
		Connection conn = DriverManager.getConnection(url, user, pass);
				// 使用Connection来创建一个Statment对象
				Statement stmt = conn.createStatement()) {
			// 执行DML,返回受影响的记录条数
			return stmt.executeUpdate(sql);
		}
	}

	public static void main(String[] args) throws Exception {
		ExecuteUpdateDemo elud = new ExecuteUpdateDemo();
		elud.createTable("create table my_test1"
				+ "(test_id int primary key, " + "test_name varchar(255))");
		System.out.println("-----建表成功-----");
		
		long result = elud.insertData("insert into my_test1(test_id,test_name) "
				+ "select id,username from userdetails");
		System.out.println("--系统中共有" + result + "条记录受影响--");
	}
}