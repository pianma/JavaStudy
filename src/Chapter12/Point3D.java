package Chapter12;

//3������ �� ���� ǥ���ϱ� ���� Ŭ����
public class Point3D extends Point {
	private int z;
	
	public int getZ() {
		return z;
	}
	//�������̵� : �θ� Ŭ������ ���ǵǾ��ִ� �޼��带 �ڽ� Ŭ�������� �������ϴ� ��
	public String getLocaiotn() {
		int x = getX();
		int y = getY();
	
		
		return " x : " + x + ", y : " + y + ", z : " + z;
	}
}

