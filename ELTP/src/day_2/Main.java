package day_2;


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
		aman.setMobile("741517845d");
		
		
	}

}
