package chapter3;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("�ڸ��� it ���Ǳ�");
		System.out.println("1. �ݶ�");
		System.out.println("2. ȯŸ");
		System.out.println("3. ���̴�");
		System.out.println("4. ����ƾ��");
		System.out.println("���Ǳ��� ��ư�� �������� : ");
		
		int button = scanf.nextInt();
		
		switch(button) {
		case 1: System.out.println("�ݶ�"); break;
		case 2: System.out.println("ȯŸ"); break;
		case 3: System.out.println("���̴�"); break;
		case 4: System.out.println("����ƾ��"); break;
		default : System.out.println("1~4���� ���� �� �ֽ��ϴ�.");
		
		}
		//���Ǳ� 1,2,3�� ��ư�� ������ �ݶ�, 4���� ������ ȯŸ 5,6���� ������ ���̴� 7���� ������ ����ƾ��
		
		switch(button) {
		case 1:
		case 2:
		case 3 :System.out.println("�ݶ�"); break;
		case 4: System.out.println("ȯŸ"); break;
		case 5 :
	    case 6: System.out.println("���̴�"); break;
		case 7: System.out.println("����ƾ��"); break;
	   default: System.out.println("1~4���� ���� �� �ֽ��ϴ�.");
			
		}
	}

}
