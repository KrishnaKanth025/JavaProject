package org.java_constructor_10;

public class College_Student_List{
	public College_Student_List() {
		System.out.println("Name : Abi");
		System.out.println("Reg.no : 01");
	}
	public College_Student_List(String a) {
			System.out.println(a);
			 
		}
	public College_Student_List(  String na ,int ro) {
			System.out.println(  na + ro  );
		 
		}
		public static void main(String[] args) {
		College_Student_List list_1=new College_Student_List();
		College_Student_List list_2=new College_Student_List("Room.no :R",125);
		College_Student_List list_3=new College_Student_List("Name : Surya");
		College_Student_List list_4=new College_Student_List( "Room.no :R",126);
	}
}
	 