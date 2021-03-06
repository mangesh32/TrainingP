package day_4;

import java.util.Scanner;

public class WordInput extends Thread{
	
	Scanner in=new Scanner(System.in);
	WordDropper wd;
	@Override
	public void run() {
		Word.typedWord="";
		wd=new WordDropper();
		CountDown timer=new CountDown();
		wd.start();
		try {
			wd.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.start();
		if(in.hasNext() && timer.isAlive()){
			Word.typedWord+=in.nextLine();
			if(Word.typedWord.toUpperCase().equals(Word.generatedWord)){
				Word.hitCount+=Word.typedWord.length();
				Word.generatedWordCount+=1;
				timer.interrupt();
				System.out.println(":) Impressive");
			}
			else{
				System.out.println(":( Incorrect Answer.");
			}
			
		}else{
			System.out.println(":( Sorry TimeOver");
		}		
		
		this.interrupt();
		
	}
	


}
