package Chapter12;

public class Zoo {

	public static void main(String[] args) {
		//������ ���ӽ��� ����
		ZooKeeper james = new ZooKeeper();
		
		//���ڿ��� ���̸� �ֱ�
		Lion lion = new Lion();
		james.feed(lion);
		
		//�䳢���� ���̸� �ֱ�
		Rabbit rabbit = new Rabbit();
		james.feed(rabbit);
		
		//�����̿��� ���̸� �ֱ�
		Monkey monkey = new Monkey();
		james.feed(monkey);
	}

}
