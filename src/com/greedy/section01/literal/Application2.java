package com.greedy.section01.literal;

public class Application2 {
	
	public static void main(String[] args) {
		
		System.out.println("정수와 정수의 연산");
		System.out.println(123 + 456);
		System.out.println(123 - 501235);
		System.out.println(123 * 10);
		System.out.println(123 / 10);
		System.out.println(123 % 10);

		System.out.println("실수와 실수의 연산");
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.3);
		System.out.println(1.23 * 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 1.0);
		
		System.out.println("정수와 실수의 연산");
		System.out.println(123 + 1.0);
		System.out.println(123 - 0.5);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);
		
		System.out.println("문자와 문자의 연산");
		System.out.println('a' + 'b');
		System.out.println('a' - 'b');
		System.out.println('a' * 'b');
		System.out.println('a' / 'b');
		System.out.println('a' % 'b');
		
		System.out.println("문자와 정수의 연산");
		System.out.println('a' + 2);
		System.out.println('a' - 2);
		System.out.println('a' * 2);
		System.out.println('a' / 2);
		System.out.println('a' % 2); //ASCII CODE

		System.out.println("문자와 실수의 연산");
		System.out.println('a' + 2.5);
		System.out.println('a' - 2.5);
		System.out.println('a' * 2.5);
		System.out.println('a' / 2.5);
		System.out.println('a' % 2.5); 
		
		System.out.println("문자열과 문자열의 연산");
		System.out.println("hello" + "world");
//		System.out.println("hello" - "world");
//		System.out.println("hello" * "world");
//		System.out.println("hello" / "world");
//		System.out.println("hello" % "world");
		
		System.out.println("문자열과 다른 형태와의 연산");
		System.out.println("helloworld" + 123);
		System.out.println("helloworld" + 123.456);
		System.out.println("helloworld" + 'a');
		System.out.println("helloworld" + true);
		
		System.out.println("논리값과의 연산");
//		System.out.println(true + false);
//		System.out.println(true + 1);
//		System.out.println(true + 1.23);
//		System.out.println(true + 'a');
		System.out.println(true + "sefd");
		
		
		
		
		
	}

}
