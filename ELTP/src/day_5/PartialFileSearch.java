package day_5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PartialFileSearch {
	static ArrayList<File> searchResult= new ArrayList<File>(); 

	public static void main(String[] args) throws IOException {
		
		Scanner in =new Scanner(System.in);
		String path,fileName;
		System.out.println("Enter Path");
		path=in.nextLine();
		
		System.out.println("Enter FileName");
		fileName=in.nextLine();
		
		
		
		fileName="\\\\"+fileName;
		fileName=fileName.replace(".","\\.");
		fileName=fileName.replace("*", ".*");
		fileName=fileName+"$";
//		System.out.println(fileName);
		
		File folder=new File(path);
		search(folder,fileName);	
		
		for(File f: searchResult)
			System.out.println(f.getCanonicalPath());
		
		
	}

	private static void search(File folder, String fileName) {
		if(folder.isDirectory())
			for(File f: folder.listFiles())
				search(f, fileName);
		else{
			Pattern p=Pattern.compile(fileName);
//			System.out.println(folder+" : "+p.pattern());
			Matcher m=p.matcher(folder.toString());
			if(m.find()){
				searchResult.add(folder);
			}
		}
			
	}

}
