package Chapter10;

import java.util.Scanner;

public class Ex4 {
	//simple1 �޼���� ���� 1���� �ʿ��� �޼���
	void simple1(int val) {
		System.out.println(val);
	}

	void simple2() {
		System.out.println("Hello World~!");
	}
	void simple3(String Message) {
		System.out.println(Message);
	}
	//simple4 �޼���� ���� 2���� �ʿ��� �޼���
	void simple4(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1);
		}else {
		System.out.println(num2);
		}
	}
	//simple5 �޼���� ���� �ΰ��� ���� �ϳ��� �ʿ��� �޼���
	void simple5(int var1,int var2, char var3) {
		if(var3 =='+') {
			System.out.println(var1+var2);
		}else if(var3 =='-') {
			System.out.println(var1-var2);
		}
	}
	//������ 2���� ����ϴ� �޼��带 �����ϼ���
	void gugudan() {
		for(int i=1; i<=9; i++) {
			System.out.println("2*"+i+"="+2*i);
		}
	}
//	//������ 2~9���� ����ڰ� ���ϴ� �������� ����ϴ� �޼��带 �����ϼ���.(�̿ϼ�)
//	void gugudan2(int gugu) {
//		for(int i=1; i<=9; i++) {
//			System.out.println(gugu+"*"+gugu);
//		}
//	}
	
	
	//10+ 20�� ����ϴ� �޼��带 �����ϼ���
	
	void sum() {
		System.out.println(10+20);
	}
	
	//�������� ���� ����� ����ϴ� �޼��带 �����ϼ���
	void sum1(int var1, int var2) {
		System.out.println(var1+var2);
		
	}
	
	//�������� ū ���� ����ϴ� �޼��带 �����ϼ���
	
	void num(int var1, int var2) {
		if(var1>var2) {
			System.out.println(var1);
		}else {
			System.out.println(var2);
		}
	}
	//10�� 11�� ���ؼ� ū ���� ����ϴ� �޼��带 �����ϼ���.
	void num2() {
		int x1 = 10;
		int x2 = 11;
		if(x1>x2) {
			System.out.println(x1);
		}else {
			System.out.println(x2);
		}
	}
	
	public static void main(String[] args) {
		Ex4 ex4 = new Ex4();
		ex4.simple1(1);
		ex4.simple3("������5��������");
		ex4.simple2();
		ex4.simple2();
		ex4.simple5(1, 1, '+');
		
		Scanner scanf = new Scanner(System.in);
//		System.out.println("����� ������(2~9) : ");
//		int gugu = scanf.nextInt();
//		
//		ex4.gugudan2(gugu);
		ex4.sum();
		ex4.sum1(4, 5);
		ex4.num(822,45);
		ex4.num2();
	}

}
