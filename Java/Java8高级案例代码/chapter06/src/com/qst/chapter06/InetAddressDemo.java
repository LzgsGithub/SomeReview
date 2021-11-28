package com.qst.chapter06;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) {

		try {
			// ��ȡ������ַ��Ϣ
			InetAddress localIp = InetAddress.getLocalHost();
			System.out.println("localIp.getCanonicalHostName()= "
					+ localIp.getCanonicalHostName());
			System.out.println("localIp.getHostAddress()= "
					+ localIp.getHostAddress());
			System.out.println("localIp.getHostName()= "
					+ localIp.getHostName());
			System.out.println("localIp.toString()= " + localIp.toString());
			System.out.println("localIp.isReachable(5000)= "
					+ localIp.isReachable(5000));
			System.out.println("====================================");

			// ��ȡָ��������ַ��Ϣ
			InetAddress baiduIp = InetAddress.getByName("www.baidu.com");
			System.out.println("baiduIp.getCanonicalHostName()= "
					+ baiduIp.getCanonicalHostName());
			System.out.println("baiduIp.getHostAddress()= "
					+ baiduIp.getHostAddress());
			System.out.println("baiduIp.getHostName()= "
					+ baiduIp.getHostName());
			System.out.println("baiduIp.toString()= " + baiduIp.toString());
			System.out.println("baiduIp.isReachable(5000)= "
					+ baiduIp.isReachable(5000));
			System.out.println("====================================");

			// ��ȡָ��ԭʼIP��ַ��Ϣ
			// InetAddress ip = InetAddress
			// .getByAddress(new byte[] { 127, 0, 0, 1 });
			InetAddress ip = InetAddress.getByName("127.0.0.1");
			System.out.println("ip.getCanonicalHostName()= "
					+ ip.getCanonicalHostName());
			System.out.println("ip.getHostAddress()= " + ip.getHostAddress());
			System.out.println("ip.getHostName()= " + ip.getHostName());
			System.out.println("ip.toString()= " + ip.toString());
			System.out.println("ip.isReachable(5000)= " + ip.isReachable(5000));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
