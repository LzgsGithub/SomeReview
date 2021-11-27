package com.qst.chapter02.exercise02;

import java.util.Scanner;
/**
 * @公司  青软实训
 * @作者 guoqy
 */
public class ArrayExc {

	public static void main(String[] args) {
		//创建键盘接受对象
		Scanner reader = new Scanner(System.in);
		//定义数组
		int[] array=new int[3];
		System.out.println("请输入一些整数，按ctrl+z输出偶数：");
		int i=0;
		int sum = 0;
		
		//1.键盘读取数据，采用while循环 
		while (reader.hasNext()&&i<3)
		{	
			array[i] = reader.nextInt();
			i++;
		}
		
		//2.统计所有数据之和,采用for循环
		for(int j=0;j<array.length;j++){
			sum=sum+array[j];
		}
		
		System.out.println("所有数据之和："+sum);
		//3.输出数组中的偶数,采用foreach循环
		System.out.print("数组中的偶数：");
		for (int k : array) {
			if(k%2==0&&k!=0){
				System.out.print(k+"  ");
			}
		}
		reader.close();
		
	}

}
