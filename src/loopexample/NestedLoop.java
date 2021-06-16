package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		
		int dan;
		int times;
		
		for(dan = 2; dan <=9; dan++) {
			for(times = 1; times <=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		}
		
		int a;
		int b;
		
		for(a = 3; a <= 7; a++) {
			for(b=1; b<=9; b++) {
				System.out.println(a + "X" + b + "=" + a*b);
			}
			System.out.println();
		}

	}

}
