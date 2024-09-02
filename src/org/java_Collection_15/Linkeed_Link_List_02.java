package org.java_Collection_15;

import java.util.LinkedList;
import java.util.List;

public final class Linkeed_Link_List_02 {
	public static void main(String[] args) {
		
		List<Object> val=new LinkedList<Object>();
		 val.add(150);
		 val.add(555);
		 val.add(45);
		 val.add("surya");
		 val.add('v');
		 val.add(null);
		 val.add(false);
		 
		 List<Object> value=new LinkedList<Object>();
		 value.add(150);
		 value.add(500);
		 value.add(45);
		 value.add("kumar");
		 
		 val.addAll(value);              //addall
		 System.out.println(val);
		  
		 
		 int size = val.size();               //size
		 System.out.println(size);
		 
		 Object object = val.get(7);         //get
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
