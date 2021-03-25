package chapter11;

public class TV {
	//�ܺη� �����ϸ� �ȵǴ� �����͸� ���ߴ� ���� ĸ��ȭ, ���������̶����
	private String color;
	private boolean power;
	private int channel;
	private int volumn;
	private int hour;
	private int minute;
	private int second;
	
	//��ü������ �����͵��� ���� ���� ��ü�� �����ؾ��ϰ�
	//��ü�� �����ϴ� ����� �����ؾ��ϹǷ�
	//������Ʈ ���� �Ⱓ�� ������� ������ ����
	//������Ʈ�� �Ը� Ŀ���� ���� ����
	//������Ʈ�� ��ü���������� ����� ���踦 �صθ�
	//�������� �ӵ��� ������ ��������.
	
	//���ν��������� �����͸� �����ϸ� �ǹǷ�
	//������Ʈ ���� �Ⱓ�� ��������� ª�� ������ ����
	//������Ʈ�� �Ը� Ŀ���� �����Ͱ� �Ź���ó�� ������ ���ǹǷ�
	//�������� �ӵ��� ������ ��������.
	
	
	//setter -> private ���� �������� ��� ������ ���ϴ� ���� �����ؾ��� �� �ʿ��� �޼���
	public void setColor(String color) {
		//TV�� �÷��� red, blue�� �����ϴ�.
		if(color.equals("red")||color.equals("blue")) {
		this.color = color;
	}else{
		System.out.println("�÷��� ����� ��縸 �˴ϴ�.");}
	}
	public String getcolor() {
		return color;
	}
	
	
	public boolean getPower() {
		return power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	
	//���� �޼��� - �ѹ��� �ϳ��� ��ɸ� �����ϴ� �޼���
	//1.�������Ѱ�
	//2.����ä�ι�ȣ�� �˷��ش�.
	public void power() {
		power = !power;
		
		if(power) {
			System.out.println("������ �ֽ��ϴ�.");
		
			showChannel();
		}else {
			System.out.println("������ �����ϴ�.");
		}
	}
	public void channelUp() {
		channel++;
		
		showChannel();
	}
	
	public void channelDown() {
		channel--;
		
		showChannel();
		
	}
	//channelUP/Down �޼��带 ���� �޼���
	public void showChannel() {
		System.out.println("����ä�ι�ȣ��"+channel+"�Դϴ�.");
	}
	

	
	public TV() {
		
		color = "����";
		power = false;
		channel = 1;
				
	}
	
	public TV(String color) {
		this.color = color;
		System.out.println("�Ű������� �Ѱ��� ������");
	}
	
	public TV(boolean power, int channel) {
		this.power = power;
		this.channel = channel;
		System.out.println("�Ű������� �ΰ��� ������");
	}
}
