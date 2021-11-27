package com.qst.chapter02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		try {
			// ����oracle����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// �������ݿ�����
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "zkl123");
			// �����������sql���
			String insertSql = "INSERT INTO userdetails(id,username,password,sex) VALUES(?,?,?,?)";
			// ����PreparedStatement����
			PreparedStatement pstmt = conn.prepareStatement(insertSql);
			// ʹ��setXXX()�����Բ�����ֵ
			pstmt.setInt(1, 7);
			pstmt.setString(2, "Tom");
			pstmt.setString(3, "123456");
			pstmt.setByte(4, (byte) 1);
			// ִ��
			int result = pstmt.executeUpdate();
			System.out.println("����" + result + "�У�");
			// �ر�����
			pstmt.close();
			// �ر�����
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
