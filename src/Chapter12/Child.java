package Chapter12;

public class Child extends Parent {
	//�θ� Ŭ�����κ��� ��� ���� ������ �����ϴ� x
	public int x;
	public int y;
	
	
	public Child() {
		this(0,0);
		System.out.println("�Ű������� ���� ������");
	}
	
	
	//��� ���迡���� �ڽ� Ŭ������ �⺻ �����ڴ�
	//�Ű������� ���� �θ� Ŭ������ �⺻ �����ڸ� ȣ���Ѵ�.
	
	//�ڽ� Ŭ������ �ν��Ͻ��� ���������
	//�θ� Ŭ������ ������� ���� �����ϹǷ�
	//�ڽ� Ŭ������ �����ڸ� ����ٸ�
	//�ڽ� Ŭ������ �������� �� ó���� �θ� Ŭ������ �����ڸ� ȣ���ؾ��Ѵ�.
	public Child(int x, int y) {
		//�⺻ �����ڸ� ���� �߰��߰�
		//�θ� Ŭ������ �⺻ �����ڸ� ȣ���ϴ� �ڵ带
		//�ۼ����� �ʾҴ�.
		super(1);
		
		
		System.out.println("�ڽ� Ŭ������ ������");
		System.out.println("�Ű� ������ �ִ� ������");
		this.x = x;
		this.y = y;
	}
	
	
	
	public void method() {
		System.out.println("X = " + x);
		System.out.println("this.x = " +this.x);
		System.out.println("super.x = "+ super.x);
	}
	
	public static void main(String[] args) {
		Child child = new Child();
	}
}