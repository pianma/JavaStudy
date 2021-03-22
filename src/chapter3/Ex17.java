package chapter3;

public class Ex17 {

	public static void main(String[] args) {
		//초기식 자리에 선언한 변수는 for문에서만 사용할 수 있다.
		//실행 순서 : 초기식 -> 조건식 -> 증감식 -> 조건식 ->증감식 ......
		for (int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		//합계
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			sum =sum +  i;
		}
		
	}
	//1부터 10까지 홀수의 합을 구하세요
	int sum_2 = 0;
	for(int i =1; i<=10; i++) {
		int su = i % 2;
		if(su == 1) {
			sum_2 =sum_2 + i;
		}
		System.out.println(sum_2);
	}
	
}

