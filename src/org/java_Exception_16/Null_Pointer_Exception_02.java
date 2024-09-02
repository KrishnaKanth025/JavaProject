package org.java_Exception_16;

public class Null_Pointer_Exception_02 {
	public static void main(String[] args) {
		String a="null";
		String b=null;
		
		
		char charAt = a.charAt(0);
		System.out.println(charAt);
		
		
		char charAt1 = a.charAt(1);
		System.out.println(charAt1);
		
		char charAt2 = a.charAt(2);
		System.out.println(charAt2);
		
		char charAt3 = a.charAt(3);
		System.out.println(charAt3);
		 
		
		char charAt4 = b.charAt( 1);
		System.out.println(charAt4);
	
	}

}
