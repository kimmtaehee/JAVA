package chapter02;

public class TypeInference {

	public static void main(String[] args) {
		
		var i = 10; //int
		var j = 10.0; // double
		var str = "hello"; //String
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		str = "test"; //�ٸ����ڿ��� ���� ����
		//str = 3; String������ ���� ���Ǿ��⶧���� ���� ���� ���� ���� ����
		
		System.out.println(str);
		
	}

}
