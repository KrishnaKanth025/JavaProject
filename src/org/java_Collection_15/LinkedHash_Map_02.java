package org.java_Collection_15;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHash_Map_02 {
	public static void main(String[] args) {
		Map<Object, Object> val=new LinkedHashMap<Object, Object>();
		
		val.put(35, "mark1");
		val.put(70, "mark2");          //put
		val.put(100, "mark3");
		val.put('j', "mark1");
		val.put(50, "mark3");
		val.put( 79, "mark2");
		val.put("java" , "mark2");
		val.put( "java", "mark2");
		val.put(95, "mark4");
	 
		System.out.println(val);
		
		int size = val.size();            //size
		System.out.println(size);
		 
		Object object = val.get(100);        //get
	    System.out.println(object);
	    
	    Set<Object> keySet = val.keySet();     //keySet
	    System.out.println(keySet);
	     
	    Collection<Object> values = val.values();     //values
	    System.out.println(values);
	 
	    boolean containsKey = val.containsKey(95);    //containskey
	    System.out.println(containsKey);
	    
	    boolean containsValue = val.containsValue("mark44");     //containsValue
	    System.out.println(containsValue);
	    
	    Set<Entry<Object,Object>> entrySet = val.entrySet();   //entrySet
	    System.out.println(entrySet);
	     
		val.remove("java");                         //remove  
		System.out.println(val);
		 
		val.clear();                          //clear
		System.out.println(val);
	   
	}

}
