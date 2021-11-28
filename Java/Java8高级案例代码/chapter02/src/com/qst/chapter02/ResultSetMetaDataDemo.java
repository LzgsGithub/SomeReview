package com.qst.chapter02;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.qst.chapter02.db.DBUtil;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) {
		String selectSql = "SELECT id,username,password,sex FROM userdetails";
		// 创建DBUtil对象
		DBUtil db = new DBUtil();
		try {
			// 通过工具类获取数据库连接
			db.getConnection();
			System.out.println("连接成功！");
			// 执行查询
			ResultSet rs = db.executeQuery(selectSql, null);
			
			// 获取结果集元数据
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("总共有：" + rsmd.getColumnCount() + "列");
			
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.println("列" + i + ":" + rsmd.getColumnName(i) + "\t"
						+ rsmd.getColumnTypeName(i) + "("
						+ rsmd.getColumnDisplaySize(i) + ")");
			}
			// 关闭连接
			db.closeAll();
		} catch (Exception e) {
			db.closeAll();
			e.printStackTrace();
		}
	}

}
