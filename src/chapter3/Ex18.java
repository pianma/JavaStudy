package chapter3;

public class Ex18 {

	public static void main(String[] args) {


		//factorial - ��������
		// 1! = 1
		// n! = n*(n-1)!
		// 3! = 3*2*1
		// 5! = 5*4*3*2*1
		
		//n!�� �ݺ����� ����ؼ� ���ϼ���
		int n = 10;
		for(int i = n; i>=1; i--) {
			
		}
		//n���� 1���� �ϳ��� �����ϸ鼭 ������ ������Ű�� �ݺ���
		int sum = 0;
		
		for(int i = n; i>=1; i--) {
			sum =sum* i;
		}
		System.out.println("������ ��� = " + sum);
	
		//1���� 10���� �����ϴ� �ϳ��� for������ Ȧ��, ¦���� ���� ���ϼ���.
		
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1; i<=10; i++) {
			if(i % 2 ==0) {
				sum2 =sum2 +i;
			}else {
				sum1 = sum1 + i;
			}
		}//end for i
		System.out.println("Ȧ���� �� = " + sum1);
		System.out.println("¦���� �� = " + sum2);
	}

}
