package Chapter10;

public class Ex5 {

	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
		int num1 = 10;
		
	
		System.out.println("before : " + num1 );
		ex5.change(num1);
		System.out.println("after : " + num1);
		System.out.println();
		
		SimpleType1 type = new SimpleType1();
		type.num1 = 10;
		
		System.out.println("before : " + type.num1);
		ex5.change(type);
		System.out.println("after : " + type.num1);
		
		int[]arr= {1,2,3};
		
		System.out.println("befor : " + arr[0]);
		ex5.change(arr[0]);
		System.out.println("after : " + arr[0]);
	}

	void change(int num1) {
		num1 = num1 * 10;
		System.out.println("change(int) : " + num1);
	}
	void change(SimpleType1 type) {
		type.num1 *= 10;
		System.out.println("Change(SimpleType1) : " + type.num1);
	}
	void change(int[] arr) {
		arr[0] = arr[0] * 10;
		System.out.println("chnge(int[]) : " + arr[0]);
		
	}
}
