package org.java_controlstatement_11;

public class Selection_Statement_If_Else {
	public static void main(String[] args) {
		int a=125;
		int b=100;
		int c=75;
		if (a<b){
			System.out.println(" 125 less than 100");
			
		} else {
			System.out.println("125 greater than 100");

		}
		if (b>c) {
			System.out.println("100 greater than 75");
			
		} else {
			System.out.println(" 100 less than 75");
		}
		if (a>c) {
			System.out.println("125 greater than 75");
		} else {
			System.out.println("125 less than 75");
		}
	}

}
