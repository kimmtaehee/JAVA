package chapter02;

public class TypeInference {

	public static void main(String[] args) {
		
		var i = 10; //int
		var j = 10.0; // double
		var str = "hello"; //String
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		str = "test"; //다른문자열은 대입 가능
		//str = 3; String형으로 먼저 사용되었기때문에 정수 값을 넣을 수가 없음
		
		System.out.println(str);
		
	}

}
