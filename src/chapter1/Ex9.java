package chapter1;

public class Ex9 {

	public static void main(String[] args) {
		//실수 -> 정수 형 변환
		// 다운캐스팅
		// 값의 변경 있음
		double a = 1.1414;
		int b = (int) a;
		System.out.println(b);
		
		//정수 -> 실수로 형 변환
		//업캐스팅
		//값의 변경 없음
		int c = 1;
		double d = c;
		System.out.println(d);
		
		//문자 -> 정수로 형변황
		//업캐스팅
		//값의 변경 없음
		char e = 'A';
		int f = (int)e;
		System.out.println(f);
		
		//정수->문자
		//다운캐스팅
		//값의 변경 있음
		int g = 100;
		char h = (char) g;
		System.out.println(h);
		
		//철수의 국,영,수 합계
		int sum = 74 + 85 + 98;
		//시험에 응시한 과목의 수 
		int subject = 3;
		//철수의 평균
		double avg = sum / (double)subject;
		
		System.out.println("철수의 총점 = " + sum);
		System.out.println("철수의 평균 = " + avg);
		
	}

}
