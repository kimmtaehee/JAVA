package loopexample;

public class BreakExmple2 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 0;
		
		for(num=0; ; num++) { //���������� for������ ����ϸ� �������� ���� �����ϹǷ� 15�� ��
			sum += num;
			if(sum >= 100) //100���� ũ�ų� ������(��������)
				break; //�ݸ� �ߴ�
		}
		System.out.println("num:" + num);
		System.out.println("sum:" + sum);

	

	}

}
