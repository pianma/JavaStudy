package Chapter10;

//Ex1 Ŭ������ �޼��带 ����� 
//���� �޼��带 ������ Ŭ����
//�޼��带 ����� -> �޼��带 �����Ѵ� / �����Ѵ�.
public class Ex1 {
	void simple1(){
		System.out.println("Hello World~!");
	}
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		//simple1 �޼��� ȣ��
		ex1.simple1();
		Ex2 ex2 = new Ex2();
		ex2.simple2();
		
		Ex2 ex3 = new Ex2();
		ex3.simple3();
		
		Ex3 ex4 = new Ex3();
		ex4.simple4();

	}

}
