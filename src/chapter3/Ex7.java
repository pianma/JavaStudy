package chapter3;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		//if�� ����
		//����ڷκ��� �� ���� �Է� �޾� ū ���� ����ϴ� ���α׷��� �����ϼ���.(�� �μ��� 0~100������ ���� ���)
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���(0<=x<=100) : ");
		System.out.println("�ι�° ���ڸ� �Է��ϼ���(0<=x<=100) : ");
		
		int num1 = scanf.nextInt();
		int num2 = scanf.nextInt();
		
		if((0<=num1 && num1 <=100) && (0<= num2 && num2 <=100)) {
			if(num1 >= num2) {
				System.out.println(num1);
			}
			else {
				System.out.println(num2);
			}
		}else  {
			System.out.println("0~100������ ���ڸ� �����մϴ�.");
		}
		
	}

}
