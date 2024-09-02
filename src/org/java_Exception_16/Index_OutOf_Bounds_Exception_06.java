package org.java_Exception_16;

import java.util.ArrayList;
import java.util.List;

public class Index_OutOf_Bounds_Exception_06 {

	public static void main(String[] args) {
		
		List<Object> ref=new ArrayList<Object>();
		
		ref.add("krishna");
		ref.add("surya");
		ref.add("vallarasu");
		ref.add(22);
		ref.add(22.2f);
		
		Object object = ref.get(0);
		System.out.println(object);
		
		Object object1 = ref.get(1);
		System.out.println(object1);
		
		Object object2 = ref.get(2);
		System.out.println(object2);
		
		Object object3 = ref.get(3);
		System.out.println(object3);
		
		Object object4 = ref.get(4);
		System.out.println(object4);
		
		Object object5 = ref.get(5);
		System.out.println(object5);
		
	}
}
