package day_4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Animation {

	public static void main(String[] args) throws InterruptedException, IOException {
		String[] str=new String[]{"-_-","+_+","^_^","*_*"};
		int i=0;
		while(true){
			if(i>3)i=0;
			System.out.println(str[i++]);
			TimeUnit.SECONDS.sleep(1);
			Runtime.getRuntime().exec("cmd cls");
		}
		
		
		
	}

}
