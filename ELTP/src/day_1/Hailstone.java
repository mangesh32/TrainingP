package day_1;

public class Hailstone {
	public static int[] sequence(int n){
		String seq=""+n;
		int count=0;
		while(n>1){
			count++;
			if(n%2==1){
				n=n*3+1;
				seq+=","+n;
			}
			else{
				n=n/2;
				seq+=","+n;
			}
		}
		int[] ans=new int[count+1];
		int j=0;
		for(String i:seq.split(",")){
			ans[j]=Integer.parseInt(i);
			j++;
		}
		return ans;
		
	}

}
