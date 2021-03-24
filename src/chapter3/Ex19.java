package chapter3;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// 아래와 같이 줄 수를 입력 받아 별(*)을 출력하세요
		/*
		 * 줄 수 : (입력) 3      줄 수 : 5			줄 수 : 7
		 * 
		 * *					*				*
		 * **					**				**
		 * ***					***				***
		 * ****					***				****
		 * 						*****			*****
		 * 										******
		 * 										*******
		 */						
		
		
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("줄 수 입력 : ");
		int row = scanf.nextInt();
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		
	}

}
