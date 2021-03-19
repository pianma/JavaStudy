package chapter3;

import java.util.Scanner;

public class Ex6 {
	static final int WEEK = 7;

	public static void main(String[] args) {
		int num = 1;
		
		if(num==1) {
			System.out.println("1입니다.");
		    }
			else if(num==2) {
				System.out.println("2입니다.");
			}
			else if(num==3) {
				System.out.println("3입니다.");
		    }
			else if(num==4) {
				System.out.println("4입니다.");
			}

		//예제실습
		//태어난 년도를 age변수에 저장하고 나이를 계산해 연령대를 출력하세요.
		
		int age = 27;
		
		if(1<=age && age<=7 ) {
			System.out.println("미취학 아동입니다.");
		}
		else if(8<=age && age<=13) {
			System.out.println("초등학생입니다.");
		}
		else if(14<= age && age<=16) {
			System.out.println("중학생입니다.");
		}
		else if(17<= age && age<19) {
			System.out.println("고등학새입니다.");
		}
		else if(age>=20) {
			System.out.println("성인입니다.");
		}
		
		//예제실습
		//2021년 3월의 날짜를 dayOfMonth 변수에 저장하고 해당 날짜의 요일을 출력하세요.
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("2021년 3월의 날짜: ");
		
		//사용자가 입력한 값을 정수로 받아온다.
		int dayOfMonth = scanf.nextInt();
		int dayOfWeek =  dayOfMonth % Ex6.WEEK;
		
		System.out.print("2021년 3월" + dayOfMonth + "일은 ");
		
		if(dayOfWeek == 0) {
			System.out.print("일요일");
		}
		if(dayOfWeek == 1) {
			System.out.print("월요일");
		}
		if(dayOfWeek == 2) {
			System.out.print("화요일");
		}
		if(dayOfWeek == 3) {
			System.out.print("수요일");
		}
		if(dayOfWeek == 4) {
			System.out.print("목요일");
		}
		if(dayOfWeek == 5) {
			System.out.print("금요일");
		}
		if(dayOfWeek == 6) {
			System.out.print("토요일");
		}
		System.out.println("입니다.");
		
		
	}

}
