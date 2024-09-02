package org.java_06;

public class method_overriding_02  extends  method_overriding_01{
	@Override
	public void  movie_Name() {
		 
		System.out.println("Jailer");
		System.out.println("LKG");
		super.movie_Name();
		}
	public static void main (String[] args) {
		 method_overriding_02 overriding=new  method_overriding_02();
		 overriding.movie_Name();
	}

}
 