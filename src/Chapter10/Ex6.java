package Chapter10;

public class Ex6 {
	//int -> add �޼��尡 �����ϰ� ���� ����� �Ŵ� �ᱣ���� ���� Ÿ���̶�� ��
	//add -> �޼����� �̸�
	//() -> �Ű������� �ʿ� ���� �޼���
	
	//��ȯŸ��
	// - ���� : byte, short, int , long
	// - �Ǽ� : float, double
	// - ���� : char
	// - ���ڿ� : String
	// - �ν��Ͻ� : �ν��Ͻ��� �´� Ŭ������
	//return : �Լ��� ���� �ǹ�
		int add() {
			int result =  1+ 1 ;
			return result;
			
		}
		//36%5�� ����� �Ǽ������� ��ȯ�ϴ� div �޼��带 �����ϼ���
		double div() {
			double result2 = 36%5;
			return (double)result2;
			//(double)�� ��������
		}
		
		//1~5������ �������� ������ ��ȯ�ϴ� stackAdd�޼��带 �����ϼ���.
		int stackAdd() {
			int result3 = 1+2+3+4+5;
			return result3;
		}
		
		public static void main(String[] args) {
			Ex6 ex6 = new Ex6();
			
			int result = ex6.add();
			System.out.println(result);
			
			double result2 = ex6.div();
			System.out.println(result2);
			
			int result3 = ex6.stackAdd();
			System.out.println(result3);
			
			
		}

	}

