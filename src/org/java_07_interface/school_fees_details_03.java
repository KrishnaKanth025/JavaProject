package org.java_07_interface;
public class school_fees_details_03 implements school_fees_details ,school_fees_details_interface_01,school_fees_details_interface_02 {
	@Override
	public void std10_Fees_Details() {
		System.out.println("Per_Year :1 lack");	
	}
	@Override
	public void std11_Fees_Details() {
		System.out.println("Per_Year :1.5 lack");
	}
	@Override
	public void std12_Fees_Details() {
		System.out.println("Per_Year :2 lack");	
	}
	@Override
	public void std08_Fees_Details() {
		System.out.println( "Per_Year :70 K");	
	}
	@Override
	public void std07_Fees_Details() {
		System.out.println( "Per_Year :65 K");
	}
	@Override
	public void std06_Fees_Details() {
		System.out.println( "Per_Year :60 K");
	}
	@Override
	public void std05_Fees_Details() {
		System.out.println( "Per_Year :55 K");
	}
	public void std09_Fees_Details() {
		System.out.println( "Per_Year :75 K"); 
	}
	public static void main(String[] args) {
		school_fees_details_03 fees =new school_fees_details_03();
		fees.std05_Fees_Details();
		fees.std06_Fees_Details();
		fees.std07_Fees_Details();
		fees.std08_Fees_Details();
		fees.std09_Fees_Details();
		fees.std10_Fees_Details();
		fees.std11_Fees_Details();
		fees.std11_Fees_Details();
		fees.std12_Fees_Details();
	}
}
