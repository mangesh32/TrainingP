package bkp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PnC {
	static HashSet<String> set = new HashSet<String>();
	static Scanner in=new Scanner(System.in);

	public static void main(String[] args) {
	
		String str=in.next();
		
		getCombinations(str);
		getPermutations(str);
		
		
		System.out.println("\nP&C--->");
		for(String s:set)
			System.out.println(s);
		
		
	}
	
	
	private static void getPermutations(String str) {
		String s=str;
		for(int i=0;i<str.length();i++){
			for(int j=0;j<str.length()-i;j++){
				s=s.substring(i)+s.substring(0, i);
				set.add(s);
			}
		}
		
		
	}
	
	public static void getCombinations(String str){
		
		//TODO Not Generating all combinations.
		
		char[] arr;		
		for(int i=0;i<str.length();i++){
			for(int j=0;j<str.length();j++){
				arr=str.toCharArray();
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				String a=new String(arr);
				set.add(a);
			}
		}
	}

}
