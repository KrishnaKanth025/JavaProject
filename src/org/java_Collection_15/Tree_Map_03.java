package org.java_Collection_15;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Tree_Map_03 {
	public static void main(String[] args) {
		Map<Integer,Object> val=new TreeMap<Integer, Object>();
		

		val.put(35, "mark1");     //put
		val.put(100, "mark3");
		val.put(70, "mark2");     
		val.put(100, "mark1");
		val.put(50, "mark3");
		val.put( 79, "mark2");
		val.put( 50 , "mark2");
		val.put( 5, "mark2");
		val.put(95, "mark4");
	 
		System.out.println(val);
		
		int size = val.size();            //size
		System.out.println(size);
		 
		Object object = val.get(100);        //object
	    System.out.println(object);
	    
	    Set<Integer> keySet = val.keySet();     //keySet
	    System.out.println(keySet);
	     
	    Collection<Object> values = val.values();     //values
	    System.out.println(values);
	    
	    boolean containsKey = val.containsKey(95);    //containskey
	    System.out.println(containsKey);
	    
	    boolean containsValue = val.containsValue("mark2");     //containsValue
	    System.out.println(containsValue);
	    
	    Set<Entry<Integer, Object>> entrySet = val.entrySet();   //entrySet
	    System.out.println(entrySet);
	     
		val.remove(100 );                         //remove  
		System.out.println(val);
		 
		val.clear();                          //clear
		System.out.println(val);
		  
	}

}
