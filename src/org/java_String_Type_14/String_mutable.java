package org.java_String_Type_14;

public class String_mutable {
	public static void main(String[] args) {
		
	 
	StringBuffer nam1= new StringBuffer ("krishna");
	StringBuffer nam2=new StringBuffer("surya");
	StringBuffer nam3=new StringBuffer("vallarasu");
	StringBuffer nam4=new StringBuffer("surya");
	
	
	System.out.println(nam1);
	System.out.println(nam2);
	System.out.println(nam3);
	System.out.println(nam4);
	
	 
	System.out.println(System.identityHashCode(nam1));
	System.out.println(System.identityHashCode(nam2));
	System.out.println(System.identityHashCode(nam3));
	System.out.println(System.identityHashCode(nam4));
	
	
	StringBuffer append = nam2.append(nam4);
	System.out.println(append);
	
	System.out.println(System.identityHashCode(append));
	
	
 }	
}
