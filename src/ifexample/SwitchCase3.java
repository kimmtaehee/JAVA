package ifexample;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("층 : ");
		int building = sc.nextInt();
		
		switch(building) {
			case 1 :
				System.out.println("약국");
				break;
				
			case 2 :
				System.out.println("정형외과");
				break;
				
			case 3 :
				System.out.println("피부과");
				break;
				
			case 4 :
				System.out.println("치과");
				break;
				
			case 5 :
				System.out.println("헬스 클럽");
				break;
				
			default :
				System.out.println("해당 층이 없습니다");
				break;
		}
		
		
		
		sc.close();

	}

}
