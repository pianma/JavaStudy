package chapter2;

public class Ex18 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.name = "����";
		student1.addr = "�λ걤���� ���� �߾Ӵ��";
		
		Student student2 = new Student();
		student2.name = "��ö��";
		student2.addr = "�λ걤���� ���� �������";
		
		Student[] studentList = new Student[5];
		
		studentList[0] = new Student();
		studentList[1] = student1;
		studentList[2] = new Student();
		studentList[3] = student2;
		studentList[4] = new Student();

		//ö���� �̻縦 ���� �ּҰ� �ٲ����. ö���� ���ο� �ּ� : �λ걤���� �λ����� ��õ��
		//ö���� �ּҸ� ���ο� �ּҷ� �ٲټ���.
		
		studentList[3].addr = "�λ걤���� �λ����� ��õ��";
		System.out.println(studentList[3].addr);
		System.out.println(student2.addr);
		
		
	}

}
