package chapter3;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		int num = 3;
		
		switch(num) {
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
		case 3:
			System.out.println("3�Դϴ�.");
		case 4:
			System.out.println("4�Դϴ�.");
			break;
		}//end switch
		int book = 2;
		
		switch(book) {
		case 0:
			System.out.println("���� �� �����ô°� ���ھ��!");
			break;
		case 1:
			System.out.println("�� ���̳� �����̱���!");
			break;
		case 2:
			System.out.println("å�� ����ϴ� ���̳׿�!");
			break;
		}
		int book2= 13;
		book2 = book2 / 10;
		
			
		System.out.println(book2/10);
		if(book2 >=0) {
			switch(book2) {
			case 0:
				System.out.println("���ݴ� ����ϼ���");
				break;
			case 1:
				System.out.println("å�д°��� �����Ͻôº��̳׿�");
				break;
			case 2:
				System.out.println("å�� ����Ͻô±���.");
				break;
				default:
					System.out.println("����� �ٵ����Դϴ�.");
			}
		}
	}
}
