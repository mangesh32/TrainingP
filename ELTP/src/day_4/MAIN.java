package day_4;

import java.util.Date;
import java.util.Scanner;

public class MAIN {
	static Scanner in;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		in=new Scanner(System.in);
		do{
			
			Date d;
			
			WordDropper wd=new WordDropper();
			WordInput wi=new WordInput();
			wd.run();
			wd.join();
			d=new Date();
			wi.run();
			
			
		}while(in.next()!="*");
		
	}

}
