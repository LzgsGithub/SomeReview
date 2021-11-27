package com.qst.chapter02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) {
		try {
			// ����oracle����
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// �������ݿ�����
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott", "zkl123");
			System.out.println("���ӳɹ���");
			// ����Statment����
			Statement stmt = conn.createStatement();
			// ��ȡ��ѯ�����
			ResultSet rs = stmt
					.executeQuery("SELECT id,username FROM userdetails");
			System.out.println("��ѯ�ɹ���");
			// ���ʽ�����е�����
			while (rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString("username"));
			}
			// �رս����
			rs.close();
			//�ر�����
			stmt.close();
			//�ر�����
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
