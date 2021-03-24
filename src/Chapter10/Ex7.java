package Chapter10;

public class Ex7 {
	
	int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	
	//두 수를 나눈 나머지를 반환하는 div메서드를 선언하시오.
	
	int div(int num1, int num2) {
		return num1 % num2;
		
	
		
	}
	//1~N까지 누적합을 반환하는 stackAdd메서드를 선언하세요.
	//N은 0이상 100이하
	int stackAdd(int n) {
		if(n < 0 || n > 100) {
			System.out.println("n은 0이상 100이하만 가능합니다.");
			
			return -1;
		}
		
		int add = 0;
		
		for(int i=1; i<=n; i++) {
			add = add + n;
		}
		
		return add;
	}
	
	//두 정수를 더한 결과를 반환하는 메서드를 만드세요.
	int var(int num1, int num2) {
		
		int result2 = num1 + num2;
		
		return result2;
		
		
	}
			
	// 두 실수를 더한 결과를 반환하는 메서드를 만드세요.
	
	double var2(double num1, double num2) {
		double result3 = num1+num2;
		return result3;
	}
	
	//하나의 정수와 하나의 실수를 더한 결과를 반환하는 메서드를 만드세요.
	
	double var3(int num1, double num2) {
		double result4 = num1 + num2;
		return result4;
	}
	

	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
		
		int result = ex7.add(1, 1);
		System.out.println(result);
		
		int result2 = ex7.var(5,4);
		System.out.println(result2);
		
		double result3 = ex7.var2(4.5,4.4);
		System.out.println(result3);
		
		double result4 = ex7.var3(4,4.4);
		System.out.println(result4);
	}

}
