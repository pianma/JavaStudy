package Chapter10;

public class Ex6 {
	//int -> add 메서드가 동작하고 나서 만들어 매는 결괏값이 정수 타입이라는 것
	//add -> 메서드의 이름
	//() -> 매개변수가 필요 없는 메서드
	
	//반환타입
	// - 정수 : byte, short, int , long
	// - 실수 : float, double
	// - 문자 : char
	// - 문자열 : String
	// - 인스턴스 : 인스턴스에 맞는 클래스명
	//return : 함수의 끝을 의미
		int add() {
			int result =  1+ 1 ;
			return result;
			
		}
		//36%5의 결과를 실수값으로 변환하는 div 메서드를 선언하세요
		double div() {
			double result2 = 36%5;
			return (double)result2;
			//(double)은 생략가능
		}
		
		//1~5까지의 누적합을 정수로 반환하는 stackAdd메서드를 선언하세요.
		int stackAdd() {
			int result3 = 1+2+3+4+5;
			return result3;
		}
		
		public static void main(String[] args) {
			Ex6 ex6 = new Ex6();
			
			int result = ex6.add();
			System.out.println(result);
			
			double result2 = ex6.div();
			System.out.println(result2);
			
			int result3 = ex6.stackAdd();
			System.out.println(result3);
			
			
		}

	}

