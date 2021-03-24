package chapter3;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		String number = "0123456789";
		System.out.println(number.length());
		for(int i=0; i<number.length(); i++) {
			System.out.println(number.charAt(i));
		}

		String a ="adsfsefeeafe";
		System.out.println(a.length());
		for(int i= 0; i<a.length(); i++ ) {
			char monja = a.charAt(i);
			if(monja=='a') {
				System.out.println(monja);
			}
		}
		//문자열을 입력받아서 문자열 내 포함되어있는 공백을 제거하고 출력하세요.
		
		Scanner scanf = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String st= scanf.nextLine();
		
		for(int i =0; i<st.length(); i++) {
			char monja2 = st.charAt(i);
			if(monja2 !=' '){
				System.out.print(monja2);
			}
		}
		
		
	}

}
