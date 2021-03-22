package chapter3;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		//음악을 다 듣고 다시 재생할지 여부
		
		char repeat ;
		
		while(true) {
			System.out.println("음악을 재생합니다.");
			int num = 1;
			while(num<=10) {
				System.out.println( num + "번 트랙 재생");
				System.out.println("다시 재생하겠습니까.?");
				repeat = scanf.next().charAt(0);
				if(repeat == 'y') {
				
					
				num = 1;
				continue;	
				}
				num = num + 1;
		}
		
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = scanf.next().charAt(0);
			
			if(repeat != 'y') {
				break;
			}
		}
	


	}
}
