package chapter3;

public class Ex2 {

	public static void main(String[] args) {
		//시험점수를 60점 이상 받은 학생은 통과, 60점 미만으로 받은 학생은 재시험처리
		int score = 60;
		
		if(score>=60) {
			System.out.println("통과");
		}
		if(score < 60) {
			System.out.println("재시험");
		}
		
	}

}
