package chapter1;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
//		Scanner scanf = new Scanner(System.in);
//		
//		System.out.println("�÷� : ");
//		
		//�÷��� 0.0~2.0���� �ֽ��ϴ�.
		//sight ������ �÷��� �����ϰ� �÷��� 0.0 ~ 2.0 �������� Ȯ���ϼ���.
		
	
//		double sight = scanf.nextDouble();
//		
//		//&&�ذ�
//		boolean right = (sight >= 0.0) && (sight <=2.0);
//		System.out.println(right);
		
		//||�ذ�
//		boolean result1 = sight < 0.0;
//		boolean result2 = sight > 2.0;
//		boolean result = result1 || result2 ;
//		
//		System.out.println(!result);
		
		//��Ʈ������
//		int num1 = 15;
//		int num2 = 17;
//		
//		int num3 = num1 & num2;
//		int num4 = num1 | num2;
//		int num5 = num1 ^ num2;
//		int num6 = num1 << 2;
//		int num7 = num1 >> 2;
//		
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
//		System.out.println(num6);
//		System.out.println(num7);
//		
		//���� ������
		
//		int num1 = true ? 1 : 2;
//		int num2 = false ? 1 : 2;
//		
//		System.out.println(num1);
//		System.out.println(num2);
		
		
//		boolean button = true;
//		String status = button ? "���� �������ϴ�." : "���� �������ϴ�." ;
//		System.out.println(status);
		
		//���� ������ 0~100�� �����Դϴ�.
		//0`100�� ���̸� �Է����� ���� "�ùٸ� �����Դϴ�."�� ��µǰ� �׷��� ���� ���� "������ �߸��Ǿ����ϴ�."�� ��µǵ��� �ϼ���.
		 
		Scanner scanf = new Scanner(System.in);
		
		int kor = scanf.nextInt();
		
		boolean result = 0<= kor && kor<=100;
		
		String str = result? "�ùٸ� �����Դϴ�." : "�߸��� �����Դϴ�.";
		System.out.println(str);
		
	
		System.out.println("========== ===========");
		
		result = kor >= 50;
		str = result ? "pass" : "Fail";
		
		System.out.println(str);
		
	}

}
