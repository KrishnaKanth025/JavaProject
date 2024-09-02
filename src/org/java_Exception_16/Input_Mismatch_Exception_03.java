package org.java_Exception_16;

import java.util.Scanner;

public class Input_Mismatch_Exception_03 {
	 
	 public static void main(String[] args) {
	 
		 Scanner ref =new Scanner (System.in) ;
		 
		 System.out.println("ENTER THE G.mail");
		 String string = ref.next();
		 System.out.println(string);
		 
		 System.out.println("ENTER THE NUMBER");
		 int nextInt = ref.nextInt();
		 System.out.println(nextInt);
	 
	}
 

}
