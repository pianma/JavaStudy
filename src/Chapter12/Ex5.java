package Chapter12;

public class Ex5 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
//		//��ĳ���� / ����ȯ ������ ���� ����
//		car = (Car)fe1;
//		
//		//�ٿ� ĳ���� / ����ȯ ������ ���� �Ұ���
//		fe2 = (FireEngine) car;
//	
//// 		car.water();
//		fe1.water();
//		fe2.water();
//	
			FireEngine fe= new FireEngine();
			System.out.println(fe instanceof FireEngine);
			System.out.println(fe instanceof Car);
			System.out.println(fe instanceof Object);
			
			Car car = new Car();
			System.out.println(car instanceof FireEngine);
			System.out.println(car instanceof Car);
			System.out.println(car instanceof Object);
	}
	

}
