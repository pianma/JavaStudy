package Chapter10;

public class Ex7 {
	
	int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	
	//�� ���� ���� �������� ��ȯ�ϴ� div�޼��带 �����Ͻÿ�.
	
	int div(int num1, int num2) {
		return num1 % num2;
		
	
		
	}
	//1~N���� �������� ��ȯ�ϴ� stackAdd�޼��带 �����ϼ���.
	//N�� 0�̻� 100����
	int stackAdd(int n) {
		if(n < 0 || n > 100) {
			System.out.println("n�� 0�̻� 100���ϸ� �����մϴ�.");
			
			return -1;
		}
		
		int add = 0;
		
		for(int i=1; i<=n; i++) {
			add = add + n;
		}
		
		return add;
	}
	
	//�� ������ ���� ����� ��ȯ�ϴ� �޼��带 ���弼��.
	int var(int num1, int num2) {
		
		int result2 = num1 + num2;
		
		return result2;
		
		
	}
			
	// �� �Ǽ��� ���� ����� ��ȯ�ϴ� �޼��带 ���弼��.
	
	double var2(double num1, double num2) {
		double result3 = num1+num2;
		return result3;
	}
	
	//�ϳ��� ������ �ϳ��� �Ǽ��� ���� ����� ��ȯ�ϴ� �޼��带 ���弼��.
	
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
