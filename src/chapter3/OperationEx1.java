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
		
		//����
		
		/*
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num); //10
		
		
		int num =10;
		System.out.println(num); //10
		System.out.println(num++); //10
		System.out.println(num); //11 ��� �Ŀ� ���� �߻�
		System.out.println(--num); //10 ��� ���� ���� �߻�
		 
		
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10)); // && ��ΰ� ���̿����� ��
		System.out.println(result); // f
		result = ((num1 > 10) || (num2 > 10)); //|| �ΰ��� �ϳ��� ���̸� ��
		System.out.println(result);
		System.out.println(!result); //! �� -> ���� ���� -> ������ �ٲ�
		
		�̰� �н�------------
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
