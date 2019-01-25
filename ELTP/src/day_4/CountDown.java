package day_4;

import java.util.Scanner;

public class CountDown extends Thread{
	int timer=1;
	Scanner in=new Scanner(System.in);
	@Override
	public void run() {
		for(int i=1;i<=5;i++){
			System.out.println(timer++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("timer stopped!!");
				in.close();
			}
		}
		in.close();
	}
	public Scanner getScanner(){
		return this.in;
	}
	

}
