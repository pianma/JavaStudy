package Chapter12;

public class Ex6 {

	public static void main(String[] args) {
		// ����� ���� �� �ִ� �ٱ��ϸ� ���� �ٱ��Ͽ� ����� ��ƺ�����.
		Apple[] applebasket = new Apple[3];
		
		applebasket[0] = new Apple();
		
		//�ٳ����� ���� �� �ִ� �ٱ��ϸ� ���� �ٱ��Ͽ� �ٳ����� ��ƺ�����.
		Banana[] bananabasket = new Banana[5];
		
		bananabasket[5] = new Banana();
		
		//���ĸ� ���� �� �ִ� �ٱ��ϸ� ���� �ٱ��Ͽ� �ٳ����� ��ƺ�����.
		Onion[] Onionbasket = new Onion[5];
		
		Onionbasket[5] = new Onion();
		
		//���� �����뿡�� ���ϸ� ����ǵ���
		//����� �����̸鼭 ��ǰ�̴�.
		//�ٳ����� �����̸鼭 ��ǰ�̴�.
		Fruit[] fruitShelf = new Fruit[3];
		fruitShelf[0] = new Apple();
		fruitShelf[1] = new Banana();
		
		//ä�� �����뿡�� ä�Ҹ� ����ǵ���
		//���Ĵ� ä���̸鼭 ��ǰ�̴�.
		Product[] vegetableShelf = new Product[3];
		vegetableShelf[0]= new Onion();
		
		
		
		
		
		Product[] basket = new Product[3];
		basket[0] = new Apple();
		basket[1] = new Apple();
		basket[2] = new Apple();
		
		
		
	}

}
