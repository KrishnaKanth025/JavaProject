package org.java_08;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner cal=new Scanner(System.in);
		
		System.out.println("Addition_1");
		int  add_1 = cal.nextInt();
		 
		System.out.println("Addition_2");
		int add_2 = cal.nextInt();
		 
		System.out.println(add_1 + add_2);
		 
		System.out.println("subtraction_1");
		int sub_1 = cal.nextInt();
		
		System.out.println("subtraction_2");
		int sub_2 = cal.nextInt();
		
		System.out.println( sub_1 - sub_2);
		
		
		System.out.println("multiple_1");
		int mul_1 = cal.nextInt();
		
		System.out.println("multiple_2");
		int mul_2 = cal.nextInt();
		
		System.out.println( mul_1 * mul_2);
		
		System.out.println("div_1");
		int div_1 = cal.nextInt();
		
		System.out.println("div_2");
		int div_2 = cal.nextInt();
		
		System.out.println(div_1 / div_2);
	}
}
