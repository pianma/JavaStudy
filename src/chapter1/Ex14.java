package chapter1;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		/*
		 * �� ������ : ����(true, false)�� �����ϱ� ���� ������
		 * true -> ��, 1 
		 * false -> ����, 0
		 * && : �� �� ��� true �� �� ����� true 
		 * || : �� �� �� �ϳ��� true�� ����� true
		 * !  : true�� false��, fasle�� true�� ���� �ݴ�� ������ִ� ������
//		 */
//		System.out.println(true && true);
//		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
//		
//		System.out.println(true || true);
//		System.out.println(true || false);
//		System.out.println(false || true);
//		System.out.println(false || false);
//		
//		System.out.println(!true);
//		System.out.println(!false);

		//Scanner ��� �ٷ��� : �Է��� ���� �������� ����� ���� ����
		//��� �ٷ��̸� ����Ϸ��� ��üȭ�� ���Ѿ���
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("���� ���� : ");
		//��ü�� �����ϴ� ��� -> �޼���
		//nextInt �޼��� : �Է��� ���� ������ �������� ���
		int kor = scanf.nextInt();
		System.out.println("kor = " + kor);
		
		//true, true ��� : 0 ~ 100�� ������ ���������� �Է��ߴ�.
		//false, true �Ǵ� true, false : 0�� �̸� �Ǵ� 100���� �ʰ��ϴ� ���������� �Է��ߴ�.
		// 
		boolean right =(kor >= 0) && (kor <=100);
		System.out.println(right);
		
		

	}

}
