package chapter3;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// �Ʒ��� ���� �� ���� �Է� �޾� ��(*)�� ����ϼ���
		/*
		 * �� �� : (�Է�) 3      �� �� : 5			�� �� : 7
		 * 
		 * *					*				*
		 * **					**				**
		 * ***					***				***
		 * ****					***				****
		 * 						*****			*****
		 * 										******
		 * 										*******
		 */						
		
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("�� �� �Է� : ");
		int row = scanf.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		
	}

}
