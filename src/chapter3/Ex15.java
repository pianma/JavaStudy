package chapter3;

public class Ex15 {

	public static void main(String[] args) {
	System.out.println("������ 1�ܺ��� 5�� �ݺ���");
	
	int j = 2;
	while(j <= 5) {
		int i = 1;
		
		while(i <=9 ) {
			System.out.println(j+"*" + i + "=" + (j*i));
			
			i += 1;
		}//end while i
		
		j = j +1;
	}//end while j

}
}
