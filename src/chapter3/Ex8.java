package chapter3;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
//		Scanner scanf = new Scanner(System.in);
//		
//		String a= "+";
//		//next �޼��� -> ����ڰ� �Է��� ���� ���ڿ��� ������
//		String b = scanf.next();
//		
//		System.out.println("a =" + a);
//		System.out.println("b =" + b);
//		
//		if(a.equals(b)) {
//			System.out.println("a��b�� �����ϴ�");
//		}
//		else {
//			System.out.println("a�� b�� �ٸ��ϴ�.");
//		}
		
	/*if�� ����
	����ڷκ��� �� ���� ��Ģ ������ �� �� �����ڸ� �Է� �޾�
	 �ش� ������ �����ϴ� ���α׷��� �����Ͻÿ�.(�� ������ ������ ����� �Ǽ������� ��µǾ����)
	*/
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
		int num1 = scanf.nextInt();
		
		System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
		int num2 = scanf.nextInt();
		
		System.out.print("�����ڸ� �Է��Ͻÿ� : ");
		String operator = scanf.next();
	
		if(operator.equals("+"))System.out.println(num1+num2);
		if(operator.equals("-"))System.out.println(num1-num2);
		if(operator.equals("*"))System.out.println(num1*num2);
		if(operator.equals("/"))System.out.println((double)num1/num2);
		else System.out.println("�����ڸ� �߸��Է��ϼ˽��ϴ�.");
	}
}
