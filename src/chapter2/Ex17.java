package chapter2;

public class Ex17 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.kor = 56;
		student1.eng = 41;
		student1.mat = 88;
		student1.sum =student1.kor + student1.eng + student1.mat;
		student1.avg =student1.sum /Student.AMOUNT_OF_SUBJECT ;
		
		System.out.println("ö���� �� �� = " + student1.sum);
		System.out.println("ö���� ��� = "+ student1.avg);
	}

}
