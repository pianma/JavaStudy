package chapter3;

import java.util.Scanner;

public class Ex6 {
	static final int WEEK = 7;

	public static void main(String[] args) {
		int num = 1;
		
		if(num==1) {
			System.out.println("1�Դϴ�.");
		    }
			else if(num==2) {
				System.out.println("2�Դϴ�.");
			}
			else if(num==3) {
				System.out.println("3�Դϴ�.");
		    }
			else if(num==4) {
				System.out.println("4�Դϴ�.");
			}

		//�����ǽ�
		//�¾ �⵵�� age������ �����ϰ� ���̸� ����� ���ɴ븦 ����ϼ���.
		
		int age = 27;
		
		if(1<=age && age<=7 ) {
			System.out.println("������ �Ƶ��Դϴ�.");
		}
		else if(8<=age && age<=13) {
			System.out.println("�ʵ��л��Դϴ�.");
		}
		else if(14<= age && age<=16) {
			System.out.println("���л��Դϴ�.");
		}
		else if(17<= age && age<19) {
			System.out.println("����л��Դϴ�.");
		}
		else if(age>=20) {
			System.out.println("�����Դϴ�.");
		}
		
		//�����ǽ�
		//2021�� 3���� ��¥�� dayOfMonth ������ �����ϰ� �ش� ��¥�� ������ ����ϼ���.
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("2021�� 3���� ��¥: ");
		
		//����ڰ� �Է��� ���� ������ �޾ƿ´�.
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek =  dayOfMonth % Ex6.WEEK;
		
		System.out.print("2021�� 3��" + dayOfMonth + "���� ");
		
		if(dayOfWeek == 0) {
			System.out.print("�Ͽ���");
		}
		if(dayOfWeek == 1) {
			System.out.print("������");
		}
		if(dayOfWeek == 2) {
			System.out.print("ȭ����");
		}
		if(dayOfWeek == 3) {
			System.out.print("������");
		}
		if(dayOfWeek == 4) {
			System.out.print("�����");
		}
		if(dayOfWeek == 5) {
			System.out.print("�ݿ���");
		}
		if(dayOfWeek == 6) {
			System.out.print("�����");
		}
		System.out.println("�Դϴ�.");
		
		
	}

}
