package loopexample;

public class BreakExmple2 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		
		for(num=0; ; num++) { //종료조건을 for문으로 사용하면 증감식을 먼저 수행하므로 15가 됨
			sum += num;
			if(sum >= 100) //100보다 크거나 같을때(종료조건)
				break; //반목문 중단
		}
		System.out.println("num:" + num);
		System.out.println("sum:" + sum);

	

	}

}
