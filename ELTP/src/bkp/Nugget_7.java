package bkp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nugget_7 {

	public static void main(String[] args) throws Exception {
		File inf=new File(args[0]);
		File outf=new File(args[1]);
		if(!inf.exists()){
			System.out.println(inf.getAbsolutePath());
			throw new Exception("Source does not exist");
		}
		if(outf.exists()){
			Scanner in=new Scanner(System.in);
			System.out.println("Destination Already Exists Overwrite it ?? (Y/N) ");
			if(in.next().equals("Y")){
				copy(inf,outf);
				System.out.println("Copied Successfully.");
			}
			else
				System.err.println("Operation Cancelled.");
		}
		else{
			copy(inf,outf);
			System.out.println("Copied Successfully.");
		}
		

	}
	public static void copy(File in,File out) throws IOException{
		FileReader fr=new FileReader(in);
		FileWriter fw= new FileWriter(out,true);
		String str = "";
		
		char ch;
		while(fr.ready()){
			fw.write((char)fr.read());	
			
		}
		
		fr.close();
		fw.close();
	}

}
