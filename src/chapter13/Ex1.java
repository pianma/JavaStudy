package chapter13;

public class Ex1 {

	public static void main(String[] args) {
		//부모 클래스에 정의되어잇는 메서드를
		//자식 클래스마다 서로 다르게 구현해야할때
		//추상 클래스가 유용하게 사용됨
		
		Lion lion = new Lion();
		Person person = new Person();
		
		lion.run();
		person.run();
		
		
		person.eat();
		lion.eat();

	}

}
