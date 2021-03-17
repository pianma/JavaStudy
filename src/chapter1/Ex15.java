package chapter1;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
//		Scanner scanf = new Scanner(System.in);
//		
//		System.out.println("시력 : ");
//		
		//시력은 0.0~2.0까지 있습니다.
		//sight 변수에 시력을 저장하고 시력이 0.0 ~ 2.0 사이인지 확인하세요.
		
	
//		double sight = scanf.nextDouble();
//		
//		//&&해결
//		boolean right = (sight >= 0.0) && (sight <=2.0);
//		System.out.println(right);
		
		//||해결
//		boolean result1 = sight < 0.0;
//		boolean result2 = sight > 2.0;
//		boolean result = result1 || result2 ;
//		
//		System.out.println(!result);
		
		//비트연산자
//		int num1 = 15;
//		int num2 = 17;
//		
//		int num3 = num1 & num2;
//		int num4 = num1 | num2;
//		int num5 = num1 ^ num2;
//		int num6 = num1 << 2;
//		int num7 = num1 >> 2;
//		
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
//		System.out.println(num6);
//		System.out.println(num7);
//		
		//삼항 연산자
		
//		int num1 = true ? 1 : 2;
//		int num2 = false ? 1 : 2;
//		
//		System.out.println(num1);
//		System.out.println(num2);
		
		
//		boolean button = true;
//		String status = button ? "불이 켜졌습니다." : "불이 꺼졋습니다." ;
//		System.out.println(status);
		
		//국어 성적은 0~100점 사이입니다.
		//0`100점 사이를 입력했을 때는 "올바른 점수입니다."가 출력되고 그렇지 않을 때는 "점수가 잘못되었습니다."가 출력되도록 하세요.
		 
		Scanner scanf = new Scanner(System.in);
		
		int kor = scanf.nextInt();
		
		boolean result = 0<= kor && kor<=100;
		
		String str = result? "올바른 점수입니다." : "잘못된 점수입니다.";
		System.out.println(str);
		
	
		System.out.println("========== ===========");
		
		result = kor >= 50;
		str = result ? "pass" : "Fail";
		
		System.out.println(str);
		
	}

}
