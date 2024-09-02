package org.java_06;

public class methodover_loading {
 public void orderPerson_Name(String name,char in) {
	 System.out.println(name+"."+in );   // Krishna Kanth.B
 	
	}
 public void orderPerson_Address (String address) {
	 System.out.println(address);// No:2719 TNHB ,Ayappakkam ,Chennai_600077;
 }
 public void orderItem_Price(String amt,int rs){
	 System.out.println(amt+":"+ rs);// Amount:1500
	 
 }
 public void orderPerson_Name(String nam) {
	System.out.println(nam);//Kumar
 }
 public void orderPerson_Name( String name ,int num){
	 System.out.println(name+"  "+num);//vallarasu  450
	  
 }
 public static void main(String [] args){
	 methodover_loading  details=new methodover_loading ();
	 details.orderPerson_Name("Krishna Kanth",'B');
	 details.orderPerson_Address("No:2719 TNHB,Ayappakkam,Chennai_600077;");
	 details.orderItem_Price("Amount" ,1500);
	 details.orderPerson_Name("Mithun", 'M');
	 details.orderPerson_Address("No:1454 TNHB,Ayappakkam,Chennai_600077");
	 details.orderItem_Price("amount", 2000); 
	 details.orderPerson_Name("Kumar");
	 details.orderPerson_Name("vallarasu", 450);
 }

}
