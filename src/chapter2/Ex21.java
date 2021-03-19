package chapter2;

public class Ex21 {

	public static void main(String[] args) {
		double pi =3.141592;
		
		System.out.println((int)pi);
		
		//소수점 3째 자리까지 출력
//		double pi_1 = pi * 1000;
//		System.out.println(pi_1);
//		
//		int pi_2= (int) (pi*1000);
//		System.out.println(pi_2);
//		
//		double pi_3 = (int) (pi * 1000) / 1000.0;
//		System.out.println(pi_3);
//		
//		System.out.println((int)pi);
//		
		double pi_1 = (int)(pi*1000) / 1000.0;
		System.out.println(pi_1);
		
		// 소수점 3째 자리에서 반올림 후 출력
		
	//문자형 번수 ch에 임의의 문자를 저장하고 해당 문자가 문자인 숫자 ('0'~'9')라면은 true를 그렇지않다면 false를 출력해주세요.
		char ch = 'a';
		boolean result = '0' <= ch && ch <='9';
		
		System.out.println(result);
		
	}

}
