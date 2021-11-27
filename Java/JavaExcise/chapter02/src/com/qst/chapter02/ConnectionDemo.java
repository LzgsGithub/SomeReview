package com.qst.chapter02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) {
		try {
			// 加载oracle驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 建立数据库连接
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "zkl123");
			System.out.println("连接成功！");
			// 创建Statment对象
			Statement stmt = conn.createStatement();
			// 获取查询结果集
			ResultSet rs = stmt
					.executeQuery("SELECT id,username FROM userdetails");
			System.out.println("查询成功！");
			// 访问结果集中的数据
			while (rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString("username"));
			}
			// 关闭结果集
			rs.close();
			//关闭载体
			stmt.close();
			//关闭连接
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
