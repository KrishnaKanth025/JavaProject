package org.java_08;

import java.util.Scanner;

public class scanner_class {
	public static void main(String[] args) {
		Scanner details =new Scanner(System.in);
		
		System.out.println("Enter The Address:");
		String address = details.nextLine();
		System.out.println("ADDRESS : "+address);//no:2719,TNHB, Ayappakkam ,Chennai_600077
		
		System.out.println("Enter The First Name :");
		String  fname = details.next();
		System.out.println("FIRST NAME : "+fname);//Krishna
		
		System.out.println("Enter The Last Nmae :");
		String lname = details.next();
		System.out.println("LAST NAME : "+lname);//Kanth.B
		
		System.out.println("Enter The Reg_No :");
		int reg_no = details.nextInt();
		System.out.println("REG_NO : "+reg_no);//3780426
		
		System.out.println("UG Score");
		float ug_per = details.nextFloat();
		System.out.println("UG SCORE : "+ug_per);//75.55
		
		System.out.println("Enter The Phone No");
		long ph_num = details.nextLong();
		System.out.println("PHONE_NUM : " +ph_num);//9361672577
		
		System.out.println("boolean");
		boolean boo = details.nextBoolean();
		System.out.println("boolean :"+boo);//TRUE
		
		System.out.println("byte");
		byte byt = details.nextByte();
		System.out.println("byte : "+byt);//126
	}

}
