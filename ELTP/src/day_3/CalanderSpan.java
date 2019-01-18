package day_3;

import java.sql.Date;
import java.util.Calendar;

import static day_1.ControlFlow.isLeap;

public class CalanderSpan {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		int curYear=2000;
		Calendar c=Calendar.getInstance();
		Calendar temp=Calendar.getInstance();
		
		
		boolean c_leap=isLeap(curYear);
		
		c.setTime(new Date(curYear,1,1));
		
		System.out.println(curYear+" DAY : "+c.get(Calendar.DAY_OF_WEEK));
		for(int i=curYear+1;i<=curYear+100;i++){
			if(isLeap(i)==c_leap){
//				System.out.println(i+" leap:"+isLeap(i));
				temp.setTime(new Date(i,1,1));
					
				
				if(c.get(Calendar.DAY_OF_WEEK)==temp.get(Calendar.DAY_OF_WEEK)){
					System.out.println(i+" DAY : "+temp.get(Calendar.DAY_OF_WEEK));
					System.out.println("SPAN :"+(i-curYear+1));
					break;
				}
				
			}
		}
		
		
		
		
	}

}
