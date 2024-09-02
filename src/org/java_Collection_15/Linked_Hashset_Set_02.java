package org.java_Collection_15;

 
 
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hashset_Set_02 {
public static void main(String[] args) {
	Set<Object> val=new LinkedHashSet<Object>();
	

	 val.add(1000);
	 val.add(233);
	 val.add(36);         
	 val.add("vallarasu");
	 val.add('k');
	 val.add(null);
	 val.add(true);
	 
	Set<Object> value =new LinkedHashSet<Object>();
	 value.add(100);
	 value.add(5000);
	 value.add(45);
	 value.add("kumar");
	 
	 val.addAll(value);                   //add all
	 System.out.println(val);
	   
	 int size = val.size();               //size
	 System.out.println(size);
	  
	 boolean contains = val.contains(225);    // contains
	 System.out.println(contains);
	 
	 val.remove(233);                         //remove **
	 System.out.println(val);
	 
	 val.clear();                          //clear
	 System.out.println(val);
}
}
