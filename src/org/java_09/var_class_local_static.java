package org.java_09;    

public  class var_class_local_static {
	//online frm
	 static int reg_No= 1894707;     // class var
	 static String name="krishna";   // class var
     static byte mark = 89;          // class var
     
	
	 public void online_Register() {
		
		 int reg_No =1894708;  // local var
		 String name ="surya"; // local var
		 byte mark = 98 ;      // local var
		 
		 System.out.println("reg.no  :" +reg_No);
		 System.out.println(name);
		 System.out.println(mark);
	 }
		 
		 static {
			 int reg_No =1894706;  // static var
			 String name ="vallarasu"; // static var
			 byte mark = 97;      // static var
			
				System.out.println("reg.no  :" +reg_No);
				System.out.println(name);
				System.out.println(mark); 
			}
		 
	 public static void main(String[] args) {
		 var_class_local_static online = new var_class_local_static ();
		 online.online_Register();
		 //System.out.println("reg.no  :" +online.reg_No);
		 //System.out.println(online.name);
		 //System.out.println(online.mark);
		 System.out.println("reg.no  :" +reg_No);
		 System.out.println(name);
		 System.out.println(mark);
	}
}
