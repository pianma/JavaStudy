package chapter3;

public class Ex5 {

	public static void main(String[] args) {
		
		/*num������ 0~100 ������ ���� �����ϰ� 
		 * num������ ����ִ� ���� 50�̻��̸� "50 �̻��� ���� ����ֽ��ϴ�."�� ����ϰ� 
		 * 50�̸��̸�  "50�̸��� ���� ����ֽ��ϴ�."�� ����ϼ���.
		 */
		
		int num = 55;
		if(num>=50) {
			System.out.println("50�̻��� ���� ����ֽ��ϴ�.");
		}
		else{
			System.out.println("50�̸��� ���� ����ֽ��ϴ�.");
		}
		
		
		/*�ڸ��� ���̰����� �ѷ��ڽ��ʹ� Ű�� 150���� ū ����� ž���� �� �ֽ��ϴ�.
		 * height ������ ������ Ű�� �����ϰ� Ű�� 150���� ū ����� "ž�°���"
		 * Ű�� 150������ ����� "ž�� �Ұ�"�� ����ϼ���.
		 */
		
		double height = 176.9;
		if (height>150) {
			System.out.println("ž�°���");
		}
		else{
			System.out.println("ž�ºҰ�");
		}
	}

}
