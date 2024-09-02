package org.java_controlstatement_11;

import java.util.Scanner;

public class Selection_Statement_Else_If {
	public static void main(String[] args) {
		Scanner mark =new Scanner (System.in);
		System.out.println("eligibilty 11th");
		System.out.println("enter the total of 10th mark");
		int marks = mark.nextInt();
		
		if (marks<200) {
			System.out.println("not eligible for 11 std");
			
		}
		else  if (marks<=300){
			System.out.println("eligible for acc & com group");

		}
		else  if (marks<=400){
			System.out.println("eligible for bussiness maths & acc group");

		}
		else if (marks<= 450) {
			System.out.println("eligible for  computer maths group");
		}
		else if (marks<= 500) {
			System.out.println("eligible for  bio maths group");
		}
		
		else {
			System.out.println("invaild mark");
		 
	}
	}
}
