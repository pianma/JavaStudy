package chapter2;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		int[] korArr = new int[4];
		korArr[0]=84;
		korArr[1]=93;
		korArr[2]=52;
		korArr[3]=42;
		
		korArr[1]=75;
		System.out.println(Arrays.toString(korArr));

		//avgArr �迭�� ����ִ� �����͵��� ��ĭ�� �ڷ� �̷�� avgArr �迭�� ù��° �����Ϳ��� 78.99�� �����ϼ���.
		
		double[] avgArr = new double[4];
		avgArr[0] = 67;
		avgArr[1] = 81.3;
		avgArr[2] = 54.67;
		avgArr[3] = 64.67;
		
		System.out.println(Arrays.toString(avgArr));
		
		avgArr[3] = avgArr[2];
		avgArr[2] = avgArr[1];
		avgArr[1] = avgArr[0];
		avgArr[0] = 78.99;
		
		System.out.println(Arrays.toString(avgArr));
	
		//�� �ε����� �����͸� ���� �ֵ��� numArr �迭�� �����ϰ� numArr�� 2�� �ε����� �����͸� ������ �����ؼ� ����ϼ���.
		
		int[] numArr = {2,4,6,8};
		
		int num = numArr[2];
		System.out.println(num);
		
		//���� ���� �� �ε����� �����͸� ���� �ֵ��� charArr�迭�� �����ϰ� charArr�� ������ 'Z'�� ������ �����ؼ� ����ϼ���.
		char[] charArr = {'Z','y'};
		
		char monja = charArr[0];
		System.out.println(monja);
		
		/////////////////////
		int[] arr1;
		arr1 = new int[2];
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
	}
}
