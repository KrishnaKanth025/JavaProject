package org.java_String_Type_14;

public class String_Immutable {
	
	public static void main(String[] args) {
		
	String nam1 ="krishna";
	String nam2 ="surya";
	String nam3 ="vallarasu";
	String nam4 ="surya";
	
	System.out.println(nam1);
	System.out.println(nam2);
	System.out.println(nam3);
	System.out.println(nam4);
	
	 
	System.out.println(System.identityHashCode(nam1));
	System.out.println(System.identityHashCode(nam2));
	System.out.println(System.identityHashCode(nam3));
	System.out.println(System.identityHashCode(nam4));
	
	String concat = nam2.concat(nam4);
	System.out.println(concat);
	
	System.out.println(System.identityHashCode(concat));
	}
}
