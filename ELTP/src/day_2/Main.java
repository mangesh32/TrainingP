package day_2;

import java.sql.Date;

import day_3.ContactStack;


public class Main {
	
	public static void methods(int ... var){//ellipses...
		/**
		 * VarArg Method
		 * --> There can only be one parameter with variable number of arguments.Other will be normal.
		 * --> Variable parameter can be appeared in right hand side only.
		 */
		for(int val:var)
			System.out.print(val+" ");
	}

	public static void main(String[] args) {
//		int arr[]={1,4,2,3};
//		System.out.println(Assign_2_1.find(arr, 2));
//		arr=Assign_2_1.sorted(arr);
//		for(int item:arr){
//			System.out.print(item+" ");
//		}
//		
//		
//		System.out.println();
//		String para="Hello my name is mangesh ghodki";
//		for(String s:Assign_2_3.sorted(para)){
//			System.out.print(s+" ");
//		}
//		
//		
//		
//		System.out.println();
//		para="To be or not to be";
//		for(String word : Assign_2_4.reverse(para)){
//			System.out.print(word+" ");
//		}
		
		Contact aman=new Contact();
		aman.setFirstName("Aman");
		aman.setLastName("Gupta");
		aman.setMobile("7415178454");
		aman.setDateOfBirth(Date.valueOf("1998-10-3"));
		aman.setEmail("aman_gupta1@persistent.com");
		
		Contact mg=new Contact();
		mg.setFirstName("Mangesh");
		mg.setLastName("Ghodki");
		mg.setMobile("9713951429");
		mg.setDateOfBirth(Date.valueOf("1997-1-4"));
		mg.setEmail("mangesh_ghodki@persistent.com");
		
		
		
		
		
		ContactStack stack=new ContactStack(1);
		stack.push(aman);
		stack.pop();
		stack.push(mg);
		
		for(Contact i:stack){
			System.out.println(i.toString());
		}
//		stack.pop();
		
		
		
	}

}
