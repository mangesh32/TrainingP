package day_4;
import java.util.Scanner;

public class MAIN {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		
		while(true){
			WordInput wi= new WordInput();
			wi.start();
			wi.join();
			System.out.println("Enter Anything To Continue...");
			if(in.next().equals("*"))
			{
				Word.showScore();
				break;
				
			}

			System.out.println("-------------------------------------------");
			
		}
		
	}

}
