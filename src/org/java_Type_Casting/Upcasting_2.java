package org.java_Type_Casting;

public class Upcasting_2 extends  Upcasting_1{
 @Override
	public void college_Details() {
	 
	 System.out.println("Duration: 3 years");
	 System.out.println("Place: Chennai");
	 super.college_Details(); 
}
 public static void main(String[] args) {
	 Upcasting_2 de=new Upcasting_2();
	 de.college_Details();
}
	
	

}
