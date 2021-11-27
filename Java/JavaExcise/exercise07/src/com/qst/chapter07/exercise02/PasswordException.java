package com.qst.chapter07.exercise02;

/**
 * @公司 QST青软实训
 * @作者 zhengjh
 */

// 自定义密码异常处理类，继承Exception类
public class PasswordException extends Exception {

	public PasswordException() {

	}

	public PasswordException(String msg) {
		super(msg);
	}

}
