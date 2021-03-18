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

		//avgArr 배열에 들어있는 데이터들을 한칸씩 뒤로 미루고 avgArr 배열의 첫번째 데이터에는 78.99를 저장하세요.
		
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
	
		//각 인덱스에 데이터를 갖고 있도록 numArr 배열을 생성하고 numArr의 2번 인덱스의 데이터를 변수에 저장해서 출력하세요.
		
		int[] numArr = {2,4,6,8};
		
		int num = numArr[2];
		System.out.println(num);
		
		//위와 같이 각 인덱스에 데이터를 갖고 있도록 charArr배열을 생성하고 charArr의 데이터 'Z'를 변수에 저장해서 출력하세요.
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
