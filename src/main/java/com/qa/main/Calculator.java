package com.qa.main;

public abstract class Calculator {
	static String decoration = "=======================================================================";

	public static int add(int a, int b) {
		return a + b;

	}

	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int multi(int a, int b) {
		return a * b;

	}
	
	
	public static int divi(int a, int b) throws ArithmeticException {
		System.out.println(decoration + "\nCan't divide by 0! Please try again!\n" + decoration);
		return a / b;

	}
	
//	public static void clear() {
////		System.out.print("Everything on the console will cleared");
////        System.out.print("\033[H\033[2J");
//        System.out.flush();
//	}

}
