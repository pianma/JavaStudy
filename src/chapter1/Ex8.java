package chapter1;

public class Ex8 {

	public static void main(String[] args) {
	char monja = 'A';
	int num = 20;
	
	//문자를 정수로 변환(업캐스팅)
	int num2 = monja;
	System.out.println(num2);
	
	//정수로 실수로 변환(업캐스팅)
	float fNum2 = num;
	System.out.println(fNum2);
	
	//다운캐스팅
	char var = (char)num;
	

	}

}
