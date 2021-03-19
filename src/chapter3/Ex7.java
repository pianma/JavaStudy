package chapter3;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		//if문 예제
		//사용자로부터 두 수를 입력 받아 큰 값을 출력하는 프로그램을 개발하세요.(단 두수는 0~100사이인 값만 허용)
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요(0<=x<=100) : ");
		System.out.println("두번째 숫자를 입력하세요(0<=x<=100) : ");
		
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
			System.out.println("0~100사이의 숫자만 가능합니다.");
		}
		
	}

}
