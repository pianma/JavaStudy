package chapter3;

public class Ex10 {

	public static void main(String[] args) {
		//� ���� ¦���� ��� "¦��"��, Ȧ���� ��� "Ȧ��"�� ȭ�鿡 ����ϼ���.
		int num = 11;
		switch(num % 2) {
		case 0:
			System.out.println("¦��");
			break;
		default:
			System.out.println("Ȧ��");
		}
		
		//2021�� 3���� Ư�� ��¥�� �ش��ϴ� ������ ȭ�鿡 ����ϼ���.
		
		int dayOFMonth = 28;
		int dayOFWeek = dayOFMonth % 7 ;
		
		switch(dayOFWeek) {
		case 1: System.out.println("������"); break;
		case 2: System.out.println("ȭ����"); break;
		case 3: System.out.println("������"); break;
		case 4: System.out.println("�����"); break;
		case 5: System.out.println("�ݿ���"); break;
		case 6: System.out.println("�����"); break;
		default : System.out.println("�Ͽ���"); break;
		
		
	
		}
		
		
	}
	
}
