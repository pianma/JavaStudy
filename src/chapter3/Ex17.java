package chapter3;

public class Ex17 {

	public static void main(String[] args) {
		//�ʱ�� �ڸ��� ������ ������ for�������� ����� �� �ִ�.
		//���� ���� : �ʱ�� -> ���ǽ� -> ������ -> ���ǽ� ->������ ......
		for (int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		//�հ�
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			sum =sum +  i;
		}
		
	}
	//1���� 10���� Ȧ���� ���� ���ϼ���
	int sum_2 = 0;
	for(int i =1; i<=10; i++) {
		int su = i % 2;
		if(su == 1) {
			sum_2 =sum_2 + i;
		}
		System.out.println(sum_2);
	}
	
}

