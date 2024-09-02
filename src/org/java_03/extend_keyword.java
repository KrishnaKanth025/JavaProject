package org.java_03;

public class extend_keyword extends single_inheritance {
	public void tamilMovieList_2022() {
		System.out.println("Tamil Movie 2022");
		System.out.println("1.Beast");
		System.out.println("2.Thiruchitrambalam");
		System.out.println("3.Vikram");
		
	}
	 private void tamilMovieList_2021() {
		System.out.println("Tamil Movie 2021");
		System.out.println("1.Ayalaan");
		System.out.println("2.Singapore Saloon");
		System.out.println("3.Lal Salaam");
	}
	 public static void  main(String[] args) {
		 extend_keyword extend=new extend_keyword();
		 extend.tamilMovieList_2021();
		 extend.tamilMovieList_2022();
		 extend.tamilMovieList_2023();
		 extend.tamilMovieList_2024();
 
	 }
}
