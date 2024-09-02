package org.java_String_13;
public class String_01 {
	public static void main(String[] args) {
		String val="Welcome Come To My Home";   String val2=""; String val3=" ";
		
		int length = val.length();    // 1. length 
		System.out.println(length);
		
		boolean equals = val.equals( "Welcome Come To My Home");   //2.equals
		System.out.println(equals);
		
		boolean equalsIgnoreCase = val.equalsIgnoreCase("WElcome Come To My Home"); //3.equalsIgnoreCase
		System.out.println(equalsIgnoreCase);
		
		String upperCase = val.toUpperCase();      //4.upperCase
		System.out.println(upperCase);
		
		String lowerCase = val.toLowerCase();      //5.lowerCase
		System.out.println(lowerCase);
		
		boolean startsWith = val.startsWith( "W");   //6.starts with
		System.out.println(startsWith);
		
		boolean endsWith = val.endsWith("e");     //7.ends with
		System.out.println(endsWith);
		
		boolean contains = val.contains("Welcome");  //8.contains
		System.out.println(contains);
		
		int indexOf = val.indexOf('o');     // 9.indexOf
		System.out.println(indexOf);
		
		int lastIndexOf = val.lastIndexOf('o');   //10. lastIndexOf
		System.out.println(lastIndexOf);
		
		char charAt= val.charAt(0);      //11. charAt
		System.out.println(charAt);
		
		String replace = val.replace("To", "Too");   //12.replace
		System.out.println(replace);
		
		String substring = val.substring(3);   //13.substring
		System.out.println(substring);
		
		String[] split = val.split(" ");        //14.split 
		for (int i = 0; i < split.length; i++) {
		System.out.println(split [i]);
		}	
		
		System.out.println(" ---------------->EMPTY<------------------");
		
		boolean empty = val.isEmpty();           //15.empty
		System.out.println(empty);
		
		boolean empty2 = val2.isEmpty();        //15.empty2
		System.out.println(empty2);
		
		boolean empty3 = val3.isEmpty();        //15.empty3
		System.out.println(empty3);
		}
	}
 
