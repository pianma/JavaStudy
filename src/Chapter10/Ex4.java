package Chapter10;

import java.util.Scanner;

public class Ex4 {
	//simple1 메서드는 정수 1개가 필요한 메서드
	void simple1(int val) {
		System.out.println(val);
	}

	void simple2() {
		System.out.println("Hello World~!");
	}
	void simple3(String Message) {
		System.out.println(Message);
	}
	//simple4 메서드는 정수 2개가 필요한 메서드
	void simple4(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1);
		}else {
		System.out.println(num2);
		}
	}
	//simple5 메서드는 정수 두개와 문자 하나가 필요한 메서드
	void simple5(int var1,int var2, char var3) {
		if(var3 =='+') {
			System.out.println(var1+var2);
		}else if(var3 =='-') {
			System.out.println(var1-var2);
		}
	}
	//구구단 2단을 출력하는 메세드를 개발하세요
	void gugudan() {
		for(int i=1; i<=9; i++) {
			System.out.println("2*"+i+"="+2*i);
		}
	}
//	//구구단 2~9단중 사용자가 원하는 구구단을 출력하는 메서드를 개발하세요.(미완성)
//	void gugudan2(int gugu) {
//		for(int i=1; i<=9; i++) {
//			System.out.println(gugu+"*"+gugu);
//		}
//	}
	
	
	//10+ 20을 출력하는 메서드를 개발하세요
	
	void sum() {
		System.out.println(10+20);
	}
	
	//두정수를 더한 결과를 출력하는 메서드를 개발하세요
	void sum1(int var1, int var2) {
		System.out.println(var1+var2);
		
	}
	
	//두정수중 큰 수를 출력하는 메서드를 개발하세요
	
	void num(int var1, int var2) {
		if(var1>var2) {
			System.out.println(var1);
		}else {
			System.out.println(var2);
		}
	}
	//10과 11을 비교해서 큰 수를 출력하는 메서드를 개발하세요.
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
		ex4.simple3("오르빗5만원가자");
		ex4.simple2();
		ex4.simple2();
		ex4.simple5(1, 1, '+');
		
		Scanner scanf = new Scanner(System.in);
//		System.out.println("출력할 구구단(2~9) : ");
//		int gugu = scanf.nextInt();
//		
//		ex4.gugudan2(gugu);
		ex4.sum();
		ex4.sum1(4, 5);
		ex4.num(822,45);
		ex4.num2();
	}

}
