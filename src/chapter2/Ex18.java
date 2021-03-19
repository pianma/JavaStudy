package chapter2;

public class Ex18 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "고영희";
		student1.addr = "부산광역시 진구 중앙대로";
		
		Student student2 = new Student();
		student2.name = "이철수";
		student2.addr = "부산광역시 남구 전포대로";
		
		Student[] studentList = new Student[5];
		
		studentList[0] = new Student();
		studentList[1] = student1;
		studentList[2] = new Student();
		studentList[3] = student2;
		studentList[4] = new Student();

		//철수가 이사를 가서 주소가 바뀌었다. 철수의 새로운 주소 : 부산광역시 부산진구 범천동
		//철수의 주소를 새로운 주소로 바꾸세요.
		
		studentList[3].addr = "부산광역시 부산진구 범천동";
		System.out.println(studentList[3].addr);
		System.out.println(student2.addr);
		
		
	}

}
