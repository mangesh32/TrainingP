package day_2;

public class SearchAndSort {
	public static boolean find(int[] arr,int item){
		for(int i : arr){
			if(i==item)return true;
		}
		return false;
	}
	public static int[] sorted(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
