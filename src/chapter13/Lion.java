package chapter13;

public class Lion extends Animal {
	public Lion() {
		super("����");
	}

	@Override
	public void run() {
		System.out.println(getMyName()+ "�� �ι߷� �޸���.");
		
	}

	@Override
	public void findFood() {
		System.out.println("��ɰ��� �Ѿư� ��ҽ��ϴ�.");
		
	}

	@Override
	public void eatFood() {
		System.out.println("��ɰ��� �ͱ��ͱ� �Խ��ϴ�.");
		
	}
}
