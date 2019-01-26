package day_4;

public class Word {
	
		static String generatedWord="";
		static String typedWord="";
		static int generatedWordCount=0;
		static int hitCount=0;
		public static void showScore() {
			System.out.println("--------------------SCORECARD---------------------------");
			System.out.println(String.format("%15s"," ")+"WordScore : "+generatedWordCount);
			System.out.println(String.format("%15s"," ")+"HitCount : "+hitCount);
			System.out.println("--------------------------------------------------------");
			
		}
	
	
	
	
}
