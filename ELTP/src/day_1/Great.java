package day_1;

import java.util.Scanner;

public class Great {

	public static int findGreat(int a,int b,int c){
		return (a>b)?((a>c)?a:((c>b)?c:b)):((b>c)?b:((c>a)?c:a));
	}

}
