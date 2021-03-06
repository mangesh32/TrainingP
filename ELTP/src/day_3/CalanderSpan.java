package day_3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static day_1.ControlFlow.isLeap;

public class CalanderSpan {

	public static void main(String[] args) throws ParseException {
		int curYear=2000;
		Calendar c=Calendar.getInstance();
		Calendar temp=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("D/M/yyyy");
		SimpleDateFormat odf=new SimpleDateFormat("D/M/yyyy E");
		
		
		boolean c_leap=isLeap(curYear);
		Date d=new Date();			
		d=sdf.parse("1/1/"+curYear);
		
		
		c.setTime(d);
		
		System.out.println(odf.format(d));
		for(int i=curYear+1;i<=curYear+100;i++){
			if(isLeap(i)==c_leap){
				Date t=new Date();			
				t=sdf.parse("1/1/"+i);
				temp.setTime(t);
					
				
				if(c.get(Calendar.DAY_OF_WEEK)==temp.get(Calendar.DAY_OF_WEEK)){
					System.out.println(odf.format(t));
					System.out.println("SPAN :"+(i-curYear));
					break;
				}
				
			}
		}
		
		
		
		
	}
	
}
