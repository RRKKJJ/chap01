package com.greedy.section05.typecasting;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long lnum = 8;
		int inum = (int) lnum;
		short snum = (short) inum;
		byte bnum = (byte) snum;
		
		double dnum = 8.0;
//		float fnum = dnum;
		float fnum = (float) dnum;
		
		float fnum2 = 4.0f;
//		long lnum2 = fnum2;
		long lnum2 = (long) fnum2;
		System.out.println("lnum2 : " + lnum2);
		
		char ch = 'a';
		byte bnum2 = (byte) ch;
		short snum2 = (short) ch;
		
		int num1 = 97;
		int num2 = -97;
		
		char ch2 = (char) num1;
		System.out.println("ch2 : " + ch2);
		
		char ch3 = (char) num2;
		System.out.println("ch3 : " + ch3);
		
		boolean isTrue = true;
//		byte b = (byte) isTrue;
		

	}

}
