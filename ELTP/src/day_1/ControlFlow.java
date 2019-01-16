package day_1;
/**
 * 
 * @author mangesh_ghodki
 *
 */
public class ControlFlow {
	public static boolean isLeap(int year){
		/**
		 * This Function Checks Whether a Given Year is LeapYear Or Not. 
		 * @author mangesh_ghodki
		 */
		if(year%4==0){
			if(year%100==0){
				if(year%400==0)
					return true;
				else
					return false;
			}			
			else
				return true;
			}
		else
			return false;
	}
	public static boolean isOdd(int val){
		return val%2==1;
	}
	public static boolean isValidDate(String date){
		String[] d=date.split("/");
		int dd=Integer.parseInt(d[0]);
		int mm=Integer.parseInt(d[1]);
		int yy=Integer.parseInt(d[2]);
		int[] leap={31,29,31,30,31,30,31,31,30,31,30,31};
		int[] nonleap={31,28,31,30,31,30,31,31,30,31,30,31};
		if(mm<1 || mm>12)return false;
		if(d[2].length()!=4)return false;
		
		if(isLeap(yy)){
			if(mm>0 && mm<13){
				if(dd>0 && dd<=leap[mm-1])return true;
				else return false;
			}
			else return false;
		}
		else{
			if(mm>0 && mm<13){
				if(dd>0 && dd<=nonleap[mm-1])return true;
				else return false;
			}
			else return false;
		}
	}
	public static double powerXN(int x,int n){
		double val=1;
		int r=n;
		if(n==0)return 1;
		if(n<0)r = n*(-1);
		for(int i=1;i<=r;i++)
			{
			if(n>0) val*=x;			
			else val/=x;
			}
		return val;
	}
	public static int factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact*=i;
		}
		return fact;
	}
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0)return false;
		}
		return true;
	}
	

}
