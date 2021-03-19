package chapter3;

public class Ex5 {

	public static void main(String[] args) {
		
		/*num변수에 0~100 사이의 값을 저장하고 
		 * num변수에 들어있는 값이 50이상이면 "50 이상의 값이 들어있습니다."를 출력하고 
		 * 50미만이면  "50미만의 값이 들어있습니다."를 출력하세요.
		 */
		
		int num = 55;
		if(num>=50) {
			System.out.println("50이상의 값이 들어있습니다.");
		}
		else{
			System.out.println("50미만의 값이 들어있습니다.");
		}
		
		
		/*코리아 놀이공원의 롤러코스터는 키가 150보다 큰 사람만 탑승할 수 있습니다.
		 * height 변수에 임의의 키를 저장하고 키가 150보다 큰 사람은 "탑승가능"
		 * 키가 150이하인 사람은 "탑승 불가"를 출력하세요.
		 */
		
		double height = 176.9;
		if (height>150) {
			System.out.println("탑승가능");
		}
		else{
			System.out.println("탑승불가");
		}
	}

}
