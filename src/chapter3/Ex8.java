package chapter3;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
//		Scanner scanf = new Scanner(System.in);
//		
//		String a= "+";
//		//next 메서드 -> 사용자가 입력한 값을 문자열로 가져옴
//		String b = scanf.next();
//		
//		System.out.println("a =" + a);
//		System.out.println("b =" + b);
//		
//		if(a.equals(b)) {
//			System.out.println("a와b가 같습니다");
//		}
//		else {
//			System.out.println("a와 b가 다릅니다.");
//		}
		
	/*if문 예제
	사용자로부터 두 수와 사칙 연산자 중 한 연산자를 입력 받아
	 해당 연산을 수행하는 프로그램을 개발하시오.(단 나눗셈 연산의 결과는 실수값으로 출력되어야함)
	*/
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하시오 : ");
		int num1 = scanf.nextInt();
		
		System.out.print("두번째 수를 입력하시오 : ");
		int num2 = scanf.nextInt();
		
		System.out.print("연산자를 입력하시오 : ");
		String operator = scanf.next();
	
		if(operator.equals("+"))System.out.println(num1+num2);
		if(operator.equals("-"))System.out.println(num1-num2);
		if(operator.equals("*"))System.out.println(num1*num2);
		if(operator.equals("/"))System.out.println((double)num1/num2);
		else System.out.println("연산자를 잘못입력하셧습니다.");
	}
}
