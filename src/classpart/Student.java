package classpart;

public class Student {

	int studentID; 
	String studentName; 
	int grade;
	String address;
	
	public void showStudentInfo() { //메소드 추가
		System.out.println(studentName + "," + address); //이름,주소 출력
	}
}
