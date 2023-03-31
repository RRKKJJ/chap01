package com.greedy.section05.typecasting;

public class Application1 {

	public static void main(String[] args) {
		
		byte bnum = 1;
		short snum = bnum;
		int inum = snum;
		long lnum = inum;
		
		int num1 = 10;
		long num2 = 20;
		
//		int result1 = num1 + num2;
		
		long result = num1 + num2;
		System.out.println("result : " + result);
		
		float fnum = 4.0f;
		double dnum = fnum;
		
		double result2 = fnum + dnum;
		System.out.println("result : " + result2);
		
//		long eight = 8888888888;
		long eight = 8888888888L;
		
		long seven = 8;
		float four = seven;
		System.out.println("four : " + four);
		
		float result3 = seven + four;
		System.out.println("result3 : " + result3);
		
		char ch1 = 'a';
		int charNumber = ch1;
		System.out.println("charNumber : " + charNumber);
		
		char ch2 = 65;
		
		System.out.println("ch2 : " + ch2);
		
		boolean isTrue = true;
//		byte b = isTrue;
		
		
	} 

}
