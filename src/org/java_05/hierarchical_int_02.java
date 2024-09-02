package org.java_05;

public class hierarchical_int_02  extends hierarchical_int_01{
	public void  second_Son_Name()
	{
		System.out.println("kumar");
	}
	public static void main(String[] args) 
	{
		hierarchical_int_02 sons=new hierarchical_int_02();
		sons.second_Son_Name ();
		sons.first_Son_Name();
		sons.father_Name();
	}

}
