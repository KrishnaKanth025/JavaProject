package org.java_Collection_15; 
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set_Set_03 {
	public static void main(String[] args) {
		Set<Object> val=new TreeSet<Object>();
		
		 val.add(100);
		 val.add(225);
		 val.add(36);         
		 val.add(22);
		 val.add(77);
		 val.add(525);
		 val.add(444);
		 
		 Set<Object> value=new TreeSet<Object>();
		 value.add(100);
		 value.add(500);
		 value.add(45);
		 value.add(56);
		 
		 val.addAll(value);                   //add all
		 System.out.println(val);
		   
		 int size = val.size();               //size
		 System.out.println(size);
		  
		 boolean contains = val.contains(225);    // contains
		 System.out.println(contains);
		 
		 val.remove(444);                         //remove  
		 System.out.println(val);
		 
		 val.clear();                          //clear
		 System.out.println(val);
	
}
}