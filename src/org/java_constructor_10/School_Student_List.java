package org.java_constructor_10;

public class School_Student_List {
	public School_Student_List(String nam) {
		System.out.println("student details:");
		System.out.println(nam);
	}
	public School_Student_List( int no) {
		this("Name : Krishna Kanth");
		System.out.println( no);
	}
	public School_Student_List(float v) {
		this(350);
		System.out.println( v );
	}
	public School_Student_List(boolean f) {
		this(70.5f);
		System.out.println( f);
	}
	public School_Student_List (char b) {
		this(true);
		System.out.println( b);
	}
	public School_Student_List( ) {
		this('P');
		
	}
 
    public static void main(String[] args) {
    	School_Student_List reg =new School_Student_List();
   
}
}
	 