package test;

import chapter11.SimpleType;
import chapter11.TV;

public class Ex1 {

	public static void main(String[] args) {
		SimpleType type = new SimpleType();
		
		type.num1 = 5;
		
		type.func1();
		
		System.out.println("========== ===========");
		
		TV LG_TV = new TV();
		LG_TV.setColor("red");
		
		//��ü���� ���α׷����� ����� �߽����� ���α׷��� �����ϴ� ���
		//��ü�� ����ϴ� �ʿ����� ��ü�� �����ϴ� ��ɸ��� ����ؾ��Ѵ�.
		
		//������ ������ ���� ä�ι�ȣ�� �˷��ְ� ���� ����?
		//1.�������Ѱ�
		LG_TV.power();
		
		//2.ä�� ��ȣ�� �˷��ش�.
		//getter
		System.out.println("���� ä�� ��ȣ�� " +LG_TV.getChannel()+"�Դϴ�.");
		
	}

}
