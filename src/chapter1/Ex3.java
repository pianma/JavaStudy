package chapter1;

public class Ex3 {

	public static void main(String[] args) {
//		char value = 'a';
//		System.out.println(value);
//
//		int number = 10;
//		System.out.println(number);
//		
//		double data = -6.2;
//		System.out.println(data);
//		
//		boolean val1 = true;
//		System.out.println(val1);
		
		double num1 = 3.14;
		System.out.println(num1);
		char num2 = 'Z';
		System.out.println(num2);
		boolean num3 = false;
		System.out.println(num3);
		int num4 = 100;
		System.out.println(num4);
		
		//변수명은 영문자, 숫자 특수문자만 사용할 수 있다.
		//변수명은 한글도 되긴 하지만 권장하지는 않음
		int word;
		int word1;
		int word$;
		int word_;
		
		//변수명의 시작은 영문자, 특수문자만 가능하다
		int _word;
		int $word;
		
		//변수명은 영문 대소문자를 구분한다.
		int apple = 17;
		int Apple = 27;
		
		System.out.println(apple);
		System.out.println(Apple);
		
		//변수명은 키워드를 사용할 수 없다.
		//키워드 - 영단어이기는 하지만 자바가 미리 선점한 영단어
		//변수는 중복해서 사용할 수 없다.
		
		int apple1 = 17;
//		int apple1 = 27; (x)
		apple1 = 27; //덮어씌움
		
		
		//카멜 표기법(낙타표기법)
		int myAge;
		char myGrade;
		double point_x;
		
		
	}
}
