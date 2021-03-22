package chapter3;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		int num = 3;
		
		switch(num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
		case 3:
			System.out.println("3입니다.");
		case 4:
			System.out.println("4입니다.");
			break;
		}//end switch
		int book = 2;
		
		switch(book) {
		case 0:
			System.out.println("조금 더 읽으시는게 좋겠어요!");
			break;
		case 1:
			System.out.println("한 권이나 읽으셨군요!");
			break;
		case 2:
			System.out.println("책을 사랑하는 분이네요!");
			break;
		}
		int book2= 13;
		book2 = book2 / 10;
		
			
		System.out.println(book2/10);
		if(book2 >=0) {
			switch(book2) {
			case 0:
				System.out.println("조금더 노력하세요");
				break;
			case 1:
				System.out.println("책읽는것을 좋아하시는분이네요");
				break;
			case 2:
				System.out.println("책을 사랑하시는군요.");
				break;
				default:
					System.out.println("당신은 다독왕입니다.");
			}
		}
	}
}
