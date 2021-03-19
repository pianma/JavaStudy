package chapter3;

public class Ex3 {

	public static void main(String[] args) {
		double weight = 63.3;
		double height = 176.9;
		double BMI = (weight/(height*height))*10000;
		
		if(BMI < 18.5) {
			System.out.println("저체중");
		}
		if(BMI>=18.5 && BMI <= 22) {
			System.out.println("정상");
		}
		if(BMI<=22) {
			System.out.println("정상");
		}
		if(23<BMI) {
			System.out.println("과체중 의심");
		}
		if(BMI<=24) {
			System.out.println("과체중 의심");
		}
		
	}

}
