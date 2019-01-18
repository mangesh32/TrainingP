package bkp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nugget_7 {

	public static void main(String[] args) throws IOException {
		File inf=new File(args[1]);
		File outf=new File(args[1]);
		if(outf.exists()){
			Scanner in=new Scanner(System.in);
			System.out.println("Destination Already Exists Overwrite it ?? (Y/N) ");
			if(in.next()=="Y"){
				copy(inf,outf);
				System.out.println("Copied Successfully.");
			}
			else
				System.err.println("Operation Cancelled.");
		}
		

	}
	public static void copy(File in,File out) throws IOException{
		FileReader fr=new FileReader(in);
		FileWriter fw= new FileWriter(out);
		
		char ch;
		while(fr.ready()){
			fw.append((char) fr.read());
		}
		fr.close();
		fw.close();
	}

}
