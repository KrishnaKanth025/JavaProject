package org.Java_01;

public class HotelMenu   {
	public void menuName1() {
		System.out.println("1. Biryani (price:120)");
	}
	public void menuName2() {
		System.out.println("2. FireRice (price:100");
	}
	public void menuName3() {
		System.out.println("3. Parotta 2pcs (prince:30)");  
	}
	public static void main(String[] args) {
		HotelMenu item=new HotelMenu();
		item.menuName1();
		item.menuName2();
		item.menuName3();
		 
		
	}

}
