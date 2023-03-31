package com.greedy.section05.typecasting;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inum = 10;
		long lnum = 100;
		
//		int isum = inum + lnum;
		int isum = (int) (inum + lnum);
		System.out.println("isum : " + isum);
		
		int isum2 = inum + (int) lnum;
		System.out.println("isum2 : " + isum2);
		
		long isum3 = inum + lnum;
		System.out.println("isum3 : " + isum3);
		
		byte byteNum1 = 1;
		byte byteNum2 = 2;
		short shortNum1 = 3;
		short shortNum2 = 4;
		
//		byte result1 = byteNum1 + byteNum2;
		int result1 = byteNum1 + byteNum2;
//		short result2 = shortNum1 + shortNum2;
		int result3 = shortNum1 + shortNum2;
		int result4 = byteNum1 + shortNum2;
		
		int inum4 = 290;
		byte bnum4 = (byte) inum4;
		
		System.out.println("inum4 : " + inum4);
		System.out.println("bnum4 : " + bnum4);
		
		double height = 173.5;
		int floorHeight = (int) height;
		
		System.out.println("height : " + height);
		System.out.println("floorHeight : " + floorHeight);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
