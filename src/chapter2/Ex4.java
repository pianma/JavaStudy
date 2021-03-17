package chapter2;

import java.util.Arrays;

public class Ex4 {

	public static void main(String[] args) {
		int[] arr1 = new int[1];
		arr1[0] = 12;
		System.out.println(Arrays.toString(arr1));
		
		double[] arr2 = new double[7];
		arr2[0] = 0.7;
		arr2[1] = 0.6;
		arr2[2] = 0.5;
		arr2[3] = 0.4;
		arr2[4] = 0.3;
		arr2[5] = 0.2;
		arr2[6] = 0.1;
		System.out.println(Arrays.toString(arr2));
		
		
		char[] arr3 = new char[2];
		arr3[0] = 'a';
		arr3[1] = 'b';
		System.out.println(Arrays.toString(arr3));
		
		//예제
		//배열 선언과 값의 저장을 따로하세요.
		
		int[] korArr = new int[4];
		korArr[0] = 84;
		korArr[1] = 93;
		korArr[2] = 52;
		korArr[3] = 42;
		System.out.println(Arrays.toString(korArr));
		
		double[] avgArr = new double[4];
		avgArr[0] = 67;
		avgArr[1] = 54.2;
		avgArr[2] = 12.5;
		avgArr[3] = 57.2;
		System.out.println(Arrays.toString(avgArr));
		
		char[] gradeArr = new char[4];
		gradeArr[0] = 'B';
		gradeArr[1] = 'A';
		gradeArr[2] = 'C';
		gradeArr[3] = 'D';
		System.out.println(Arrays.toString(gradeArr));
		
		
		
		
	}

}
