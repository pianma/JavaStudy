package Chapter10;

public class Ex8 {
	
	//세 add 메서드는 이름은 같지만 매개변수가 다르므로 
	//오버로딩된 메서드이다.

		int add(int num1, int num2)
		{
			return num1+ num2;
		}
		
		double add(double fnum1, double fnum2) {
			return fnum1+fnum2;
			
		}
		
		double add(int num1, double fnum1) {
			return num1 + fnum1;
		}
		int num1;
		static int num2;
		
		void instanceMemberMethod() {
			System.out.println("인스턴스 멤버 메서드");
		}
		static void classMemberMethod() {
			System.out.println("클래스 멤버 메서드");
		}
		
		public static void main(String[] args) {
			Ex8 ex8 = new Ex8();
			
			ex8.add(1, 1);
			ex8.add(1, 0.1 );
			ex8.add(0.1, 0.2);
			
			ex8.instanceMemberMethod();
			Ex8.classMemberMethod();
		}

}
