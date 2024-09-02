package org.java_Collection_15;

import java.util.ArrayList;
import java.util.List;

public class Array_List_List_01 {
	public static void main(String[] args) {
	 List<Object> val=new ArrayList<Object>(); 
	 
	 val.add(100);
	 val.add(225);
	 val.add(36);
	 val.add("vallarasu");
	 val.add('k');
	 val.add(null);
	 val.add(true);
	 
	 System.out.println(val);
	 
	 int size = val.size();               //size
	 System.out.println(size);
	 
	 Object object = val.get(2);         //get
	 System.out.println(object);
	 
	 int indexOf = val.indexOf(null);      //indexOf
	 System.out.println(indexOf);
	 
	 boolean contains = val.contains(225);    // contains
	 System.out.println(contains);
	 
	 Object set = val.set(1, "krishna");      //set
	 System.out.println(val);
	 
	 val.remove(2);                         //remove
	 System.out.println(val);
	 
	 val.clear();                          //clear
	 System.out.println(val);
	   
	} 
}
