package org.java_controlstatement_11;
public class Selection_Switch {
public static void main(String[] args) {
	String cal = "null";
	int a=50;
	int b=25;
	int c=2;
	switch (cal) {
	case "add":
         System.out.println(a+b);		
		break;
		
	case "sub":
		System.out.println(a-b);
		break;
		
	case "add&sub":
		System.out.println(a+b-c);
		break;
	case "mul":
		System.out.println(a*b*c);
		break;
	case "div" :
		System.out.println(a/b/c);	
		break;
		
	default:
		System.out.println("invalid cal");
		break;
	}
}
}
