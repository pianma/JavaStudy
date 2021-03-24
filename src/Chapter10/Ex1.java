package Chapter10;

//Ex1 클래스는 메서드를 만들고 
//만든 메서드를 실행할 클래스
//메서드를 만든다 -> 메서드를 정의한다 / 선언한다.
public class Ex1 {
	void simple1(){
		System.out.println("Hello World~!");
	}
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		//simple1 메서드 호출
		ex1.simple1();
		Ex2 ex2 = new Ex2();
		ex2.simple2();
		
		Ex2 ex3 = new Ex2();
		ex3.simple3();
		
		Ex3 ex4 = new Ex3();
		ex4.simple4();

	}

}
