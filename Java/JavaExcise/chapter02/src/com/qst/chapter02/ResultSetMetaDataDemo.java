package com.qst.chapter02;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.qst.chapter02.db.DBUtil;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		String selectSql = "SELECT id,username,password,sex FROM userdetails";
		// ����DBUtil����
		DBUtil db = new DBUtil();
		try {
			// ͨ���������ȡ���ݿ�����
			db.getConnection();
			System.out.println("���ӳɹ���");
			// ִ�в�ѯ
			ResultSet rs = db.executeQuery(selectSql, null);
			
			// ��ȡ�����Ԫ����
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("�ܹ��У�" + rsmd.getColumnCount() + "��");
			
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.println("��" + i + ":" + rsmd.getColumnName(i) + "\t"
						+ rsmd.getColumnTypeName(i) + "("
						+ rsmd.getColumnDisplaySize(i) + ")");
			}
			// �ر�����
			db.closeAll();
		} catch (Exception e) {
			db.closeAll();
			e.printStackTrace();
		}
	}

}
