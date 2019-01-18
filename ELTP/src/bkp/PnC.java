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
		ArrayList<Character> arr=new ArrayList<Character>();
		for(char chr: str.toCharArray())arr.add(Character.valueOf(chr));
		for(int i=0;i<str.length();i++){
			Character c=arr.get(0);
			arr.remove(0);
			arr.add(c);
			String fstr="";
			for(Character ch:arr){
				fstr+=ch.charValue();				
			}
			set.add(fstr);
		}
		
		
	}
	public static void getCombinations(String str){
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