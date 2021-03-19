package chapter2;

public class Ex20 {

	public static void main(String[] args) {
		//System.out.println(12 / 0);
		
		System.out.println(12.0 / 0.0);
		
		short a = 32767;
		short b = 1;
		
		//short 으로 선언하면 컴파일오류됨 -32767 ~ 32767 이라서
		int c = a+b;
		System.out.println(c);
	}

}
