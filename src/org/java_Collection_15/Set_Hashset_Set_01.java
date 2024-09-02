package org.java_Collection_15;

import java.util.HashSet;
import java.util.Set;

public class Set_Hashset_Set_01 {
public static void main(String[] args) {
	Set<Object> val=new HashSet<Object>();
	
	 val.add(100);
	 val.add(225);
	 val.add(36);         
	 val.add("vallarasu");
	 val.add('k');
	 val.add(null);
	 val.add(true);
	 
	 Set<Object> value=new HashSet<Object>();
	 value.add(100);
	 value.add(500);
	 value.add(45);
	 value.add("kumar");
	 
	 val.addAll(value);                   //add all
	 System.out.println(val);
	   
	 int size = val.size();               //size
	 System.out.println(size);
	  
	 boolean contains = val.contains(225);    // contains
	 System.out.println(contains);
	 
	 boolean remove = val.remove('k');                         //remove 
	 System.out.println(val);
	 
	 val.clear();                      //clear
	 System.out.println(val);
}
}
     