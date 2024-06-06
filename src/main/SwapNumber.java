package main;

public class SwapNumber {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		swapNumbers(num1, num2);
	}
	
	public static void swapNumbers(int num1, int num2) {
		System.out.println("Before swap");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After swap");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}
