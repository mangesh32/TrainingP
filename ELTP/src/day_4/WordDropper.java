package day_4;

import java.util.Random;
public class WordDropper extends Thread{
	Dictionary[] dict=Dictionary.values();

	
	@Override
	public void run() {
		
		Random r=new Random();
		Word.generatedWord=dict[r.nextInt(dict.length)].toString();
		System.out.println(Word.generatedWord);
		
		
		
	}

}
