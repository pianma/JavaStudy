package chapter3;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//������ �� ��� �ٽ� ������� ����
		
		char repeat ;
		
		while(true) {
			System.out.println("������ ����մϴ�.");
			int num = 1;
			while(num<=10) {
				System.out.println( num + "�� Ʈ�� ���");
				System.out.println("�ٽ� ����ϰڽ��ϱ�.?");
				repeat = scanf.next().charAt(0);
				if(repeat == 'y') {
				
					
				num = 1;
				continue;	
				}
				num = num + 1;
		}
		
			System.out.println("�ٽ� ó������ ����Ͻðڽ��ϱ�?");
			repeat = scanf.next().charAt(0);
			
			if(repeat != 'y') {
				break;
			}
		}
	


	}
}
