package org.java_07_abst;

public class college_fees_details_02 extends college_fees_details {

	@Override
	public void bcom_Fees_Details() {
		 System.out.println("20000 RS");
	}

	@Override
	public void bcom_Cs_Fess_Details() {
		System.out.println("22000 RS");
		 
	}

	@Override
	public void bsc_Com_Fees_Details() {
		 System.out.println("26000 RS");
		
	}
	private void mca_Fees_Details() {
		 System.out.println("30000 RS");
	}
	public static void main(String[] args) {
		college_fees_details_02 fees =new college_fees_details_02();
		fees.bca_Fees_Details();
		fees.bcom_Cs_Fess_Details();
		fees.bcom_Fees_Details();
		fees.bsc_Com_Fees_Details();
		fees.mca_Fees_Details();
		
	}
	

}
