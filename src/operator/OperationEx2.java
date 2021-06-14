package operator;

public class OperationEx2 {

	public static void main(String[] args) {
		
		int gameScore = 150;
		
		int lastScore1 = ++gameScore; //1만큼 더한 값
		System.out.println(lastScore1);
		
		
		int lastScore2 = --gameScore; // 1만큼 뺀 값
		System.out.println(lastScore2);
		
		/*
		int gameScore = 150;
		
		int lastScore1 = gameScore++; 
		System.out.println(lastScore1);
		
		
		int lastScore2 = gameScore--; 
		System.out.println(lastScore2);
		*/
	}

}
