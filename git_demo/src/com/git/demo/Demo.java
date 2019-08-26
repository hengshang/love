package com.git.demo;

public class Demo {

	public static void main(String[] args) {
		int test = new Demo().test(5, 9);
		System.out.println("½á¹ûÊÇ="+test);
		
	}
	
	public int test(int a,int b) {
		int c=a+b;
		return c;
	}
}
