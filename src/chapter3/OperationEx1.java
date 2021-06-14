package chapter3;

public class OperationEx1 {

	public static void main(String[] args) {
		
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value); // f

		System.out.println(myAge <= 25); //t
		System.out.println(myAge == teacherAge); //f
		
		char ch;
		ch = (myAge > teacherAge) ? 'T':'F';
		
		System.out.println(ch); //f
		
		System.out.println("----------------------------------");
		
		//예제
		
		/*
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num); //10
		
		
		int num =10;
		System.out.println(num); //10
		System.out.println(num++); //10
		System.out.println(num); //11 출력 후에 값이 발생
		System.out.println(--num); //10 출력 전에 값이 발생
		 
		
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10)); // && 모두가 참이여야지 참
		System.out.println(result); // f
		result = ((num1 > 10) || (num2 > 10)); //|| 두개중 하나가 참이면 참
		System.out.println(result);
		System.out.println(!result); //! 참 -> 거짓 거짓 -> 참으로 바뀜
		
		이건 패스------------
		int num1 = 2;
		int num2 = 10;
		
		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		
		int num = 8;
		
		System.out.println(num += 10); //18
		System.out.println(num -= 10); //-2
		System.out.println(num >>= 2); //
		
		----------------------
		*/
		
		int num = 10;
		int num2 = 20;
		
		int result = (num >=10) ? num2 + 10 : num2 - 10;
		System.out.println(result); //30
		
		
	}

}
