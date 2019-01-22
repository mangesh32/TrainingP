package day_4;

import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class WordInput extends Thread{
	
	Scanner in=new Scanner(System.in);
	WordDropper wd;
	@Override
	public void run() {
		wd=new WordDropper();
		Date d=new Date();
		
		InputStreamReader isr=new InputStreamReader(System.in);
		String s="";
		try {
			while(isr.ready()){
				s+=(char)isr.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		if(Word.typedWord.equals(Word.generatedWord)){
			Word.hitCount+=Word.typedWord.length();
			Word.generatedWordCount+=1;
		}
		
	}
	

}
