package day_4;

public class CountDown extends Thread{
	int timer=0;
	@Override
	public void run() {
		for(int i=1;i<=5;i++){
			timer++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("TimeTaken : "+timer+" second");
			}
		}
	}

}
