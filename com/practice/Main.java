package com.practice;

public class Main {
	public static void main(String[] args) {
		System.out.println("Display: " + display());
		System.out.println("Addition: " + add(10,10));
		System.out.println("Subtraction: " + sub(10,10));
		System.out.println("Multiplication: " + mul(10,10));
		System.out.println("Division: " + div(10,10));
		System.out.println("Modulo Division: " + mod(10,10));
	}

	public static int add(int x, int y)
	{
		return x + y;

	}
	
	public static int sub(int x, int y)
	{
		return x - y;

	}
	
	public static int mul(int x, int y)
	{
		return x * y;

	}
	
	public static int div(int x, int y)
	{
		return x / y;

	}

	public static int mod(int x, int y)
	{
		return x % y;

	}

	public static int display()
	{
		return "Welcome to Feature-2 branch";
	}
	

}
