package day_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Temp {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader("H:/users/mangesh_ghodki/desktop/words.txt"));
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line.toUpperCase()+",");
			
		}
	
	
	}

}
