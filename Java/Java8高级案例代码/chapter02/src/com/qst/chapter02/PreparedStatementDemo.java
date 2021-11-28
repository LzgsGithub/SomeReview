package com.qst.chapter02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		try {
			// 加载oracle驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 建立数据库连接
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "zkl123");
			// 定义带参数的sql语句
			String insertSql = "INSERT INTO userdetails(id,username,password,sex) VALUES(?,?,?,?)";
			// 创建PreparedStatement对象
			PreparedStatement pstmt = conn.prepareStatement(insertSql);
			// 使用setXXX()方法对参数赋值
			pstmt.setInt(1, 7);
			pstmt.setString(2, "Tom");
			pstmt.setString(3, "123456");
			pstmt.setByte(4, (byte) 1);
			// 执行
			int result = pstmt.executeUpdate();
			System.out.println("插入" + result + "行！");
			// 关闭载体
			pstmt.close();
			// 关闭连接
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
