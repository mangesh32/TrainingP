package day_4;

import java.util.Scanner;

public class WordInput extends Thread{
	
	Scanner in=new Scanner(System.in);
	WordDropper wd;
	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		wd=new WordDropper();
		CountDown timer=new CountDown();
		timer.start();
		Scanner in=timer.getScanner();
		try{
			
			Word.typedWord=in.next();
			timer.destroy();
			
		}
		catch(Exception e){
			
		}
		
		
		if(Word.typedWord.equals(Word.generatedWord)){
			Word.hitCount+=Word.typedWord.length();
			Word.generatedWordCount+=1;
		}
		
	}
	

}
