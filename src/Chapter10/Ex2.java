package Chapter10;

public class Ex2 {
		
	void simple2(){
		System.out.println("Java Program Start!");
	}
	void simple3() {
		System.out.println("1+1 = 2 ");
	}

	public static void main(String[] args) {
	Ex2 ex2 = new Ex2();
	ex2.simple2();
	
	Ex2 ex3 = new Ex2();
	ex3.simple3();
	}
}
