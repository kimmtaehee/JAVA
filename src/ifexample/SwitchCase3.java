package ifexample;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� : ");
		int building = sc.nextInt();
		
		switch(building) {
			case 1 :
				System.out.println("�౹");
				break;
				
			case 2 :
				System.out.println("�����ܰ�");
				break;
				
			case 3 :
				System.out.println("�Ǻΰ�");
				break;
				
			case 4 :
				System.out.println("ġ��");
				break;
				
			case 5 :
				System.out.println("�ｺ Ŭ��");
				break;
				
			default :
				System.out.println("�ش� ���� �����ϴ�");
				break;
		}
		
		
		
		sc.close();

	}

}
