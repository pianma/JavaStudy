package chapter3;

public class Ex3 {

	public static void main(String[] args) {
		double weight = 63.3;
		double height = 176.9;
		double BMI = (weight/(height*height))*10000;
		
		if(BMI < 18.5) {
			System.out.println("��ü��");
		}
		if(BMI>=18.5 && BMI <= 22) {
			System.out.println("����");
		}
		if(BMI<=22) {
			System.out.println("����");
		}
		if(23<BMI) {
			System.out.println("��ü�� �ǽ�");
		}
		if(BMI<=24) {
			System.out.println("��ü�� �ǽ�");
		}
		
	}

}
