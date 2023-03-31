package com.greedy.section02.variable;

public class Application1 {
	
	public static void main(String[] args) {
		
		System.out.println("값에 의미 부여");
		System.out.println("보너스 포함 급여 : " + (1000000 + 200000) + "원");
		
		int salary = 1000000;
		int bonus = 200000;
		System.out.println("보너스 포함 급여 : " + (salary + bonus) + "원");
		
		System.out.println("변수에 저장한 값 재사용");
		System.out.println("1번 고객에게 100포인트 지급하였습니다");
		System.out.println("2번 고객에게 100포인트 지급하였습니다");
		System.out.println("3번 고객에게 100포인트 지급하였습니다");
		System.out.println("4번 고객에게 100포인트 지급하였습니다");
		System.out.println("5번 고객에게 100포인트 지급하였습니다");
		System.out.println("6번 고객에게 100포인트 지급하였습니다");
		System.out.println("7번 고객에게 100포인트 지급하였습니다");
		System.out.println("8번 고객에게 100포인트 지급하였습니다");
		System.out.println("9번 고객에게 100포인트 지급하였습니다");
		
		int point = 100;
		System.out.println("1번 고객에게 " + point + "포인트 지급하였습니다");
		System.out.println("2번 고객에게 " + point + "포인트 지급하였습니다");
		System.out.println("3번 고객에게 " + point + "포인트 지급하였습니다");
		System.out.println("4번 고객에게 " + point + "포인트 지급하였습니다");
		System.out.println("5번 고객에게 " + point + "포인트 지급하였습니다");
		System.out.println("6번 고객에게 " + point + "포인트 지급하였습니다");
		System.out.println("7번 고객에게 " + point + "포인트 지급하였습니다");
		System.out.println("8번 고객에게 " + point + "포인트 지급하였습니다");
		System.out.println("9번 고객에게 " + point + "포인트 지급하였습니다");		
		
		
		int sum = 0;
		sum = sum + 10;
//		sum + 10 = sum;
		System.out.println(sum);
		
		sum = sum + 10;
		System.out.println(sum);
		
		
	}

}
