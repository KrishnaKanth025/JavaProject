package org.java_09_keyword;

public class keyword_static_final_this_super extends keyword_2 { // using extends keyword
	
	static int value_1 =555;   // using static keyword 
	static int value_2 =444;
	public void key_Value() {
		final int value_1 = 666; // using final keyword
		int value_2 = 777;
		
		//value_1++;  
		value_2++;   //it means add one 777+1
		System.out.println(value_1);
		System.out.println(value_2);
		System.out.println(super.value_1);   // super key
		System.out.println(this.value_1);    // this key
		System.out.println(super.value_2);   // super key
		System.out.println(this.value_2);    // this.key
		
	}
	public static void main(String [] args ) {
		keyword_static_final_this_super val = new keyword_static_final_this_super();{
			val.key_Value();
			
		}
		
	}

}
