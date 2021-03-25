package chapter11;

public class Car {
	private int color;
	private int wheel;
	private float speed;
	private double fuel;
	
	public void setColor(int color) {
		this.color = color;
	}
	
	//������ -> �ν��Ͻ��� ������� ������ �ڵ����� ȣ��Ǵ� �޼���
	//�Ϲ����� �޼��尡 �ƴϹǷ� �̸��� ����������
	//������ �޼����� �̸��� Ŭ������ �̸��� ���ƾ��Ѵ�.
	//������ �޼���� ��ȯŸ���� ����.
	//�������� ���� �����ڴ� public, private �� �ϳ��� �� �� �ִ�.
	public Car() {
		/*
		 * �ν��Ͻ��� ���� ��
		 * �ش� �ν��Ͻ��� �츮�� ���ϴ� ���� ���� �ֵ���
		 * ������ �� ����
		 */
		this(1,4,0,0);
		
		System.out.println("�Ű����� ���� �ν��Ͻ��� ������� ��");
		System.out.println("�� �����ڰ� ó���� ������ �ڵ��");
	}
	public Car(int color) {
		
		//������ �ȿ��� �ٸ� �����ڸ� ȣ���ϴ� ���
		//this(�Ű�����)�� �����ڸ� ȣ���ϴ� ���
		this.color = color;
		
		
		//this()�� ����ϸ� �����ڸ� ȣ���� �� �ִµ�
		//�����ڸ��� �����ڸ� ȣ���� �� �ִ�.
		//�Ϲ����� �޼��尡 �����ڸ� ȣ���� �� ����.
		//�ٸ� �����ڸ� ȣ���ϴ� �� �ڵ�� �������� �� ���� ��ġ�ؾ��Ѵ�.
		//this(color,0,0.0f,0.0);
		}
	
	public Car(int color, int wheel) {
		this.color = color;
		this.wheel = wheel;
		//this(color,wheel,0.0f,0.0);
	}
	
	public Car(int color, int wheel, float speed) {
		this.color = color;
		this.wheel = wheel;
		this.speed = speed;
		//this(color,wheel,speed,0.0);
	}
	
	public Car(int color, int wheel, float speed, double fuel) {
		this.color = color;
		this.wheel = wheel;
		this.speed = speed;
		this.fuel = fuel;
	}
}
	
	
	
	
	
	
	
	

