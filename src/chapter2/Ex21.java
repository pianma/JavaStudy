package chapter2;

public class Ex21 {

	public static void main(String[] args) {
		double pi =3.141592;
		
		System.out.println((int)pi);
		
		//�Ҽ��� 3° �ڸ����� ���
//		double pi_1 = pi * 1000;
//		System.out.println(pi_1);
//		
//		int pi_2= (int) (pi*1000);
//		System.out.println(pi_2);
//		
//		double pi_3 = (int) (pi * 1000) / 1000.0;
//		System.out.println(pi_3);
//		
//		System.out.println((int)pi);
//		
		double pi_1 = (int)(pi*1000) / 1000.0;
		System.out.println(pi_1);
		
		// �Ҽ��� 3° �ڸ����� �ݿø� �� ���
		
	//������ ���� ch�� ������ ���ڸ� �����ϰ� �ش� ���ڰ� ������ ���� ('0'~'9')����� true�� �׷����ʴٸ� false�� ������ּ���.
		char ch = 'a';
		boolean result = '0' <= ch && ch <='9';
		
		System.out.println(result);
		
	}

}
