package chapter1;

public class Ex9 {

	public static void main(String[] args) {
		//�Ǽ� -> ���� �� ��ȯ
		// �ٿ�ĳ����
		// ���� ���� ����
		double a = 1.1414;
		int b = (int) a;
		System.out.println(b);
		
		//���� -> �Ǽ��� �� ��ȯ
		//��ĳ����
		//���� ���� ����
		int c = 1;
		double d = c;
		System.out.println(d);
		
		//���� -> ������ ����Ȳ
		//��ĳ����
		//���� ���� ����
		char e = 'A';
		int f = (int)e;
		System.out.println(f);
		
		//����->����
		//�ٿ�ĳ����
		//���� ���� ����
		int g = 100;
		char h = (char) g;
		System.out.println(h);
		
		//ö���� ��,��,�� �հ�
		int sum = 74 + 85 + 98;
		//���迡 ������ ������ �� 
		int subject = 3;
		//ö���� ���
		double avg = sum / (double)subject;
		
		System.out.println("ö���� ���� = " + sum);
		System.out.println("ö���� ��� = " + avg);
		
	}

}
