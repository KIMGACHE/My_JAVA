package C11;

import java.util.Arrays;
import java.util.Scanner;

public class C01원시타입배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[5];
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		arr1[3] = sc.nextInt();
		arr1[4] = sc.nextInt();
		System.out.println("배열길이 : " + arr1.length);
		System.out.println(arr1 instanceof Object);
		System.out.println("--------------------");
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]+ " ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		for(int el : arr1)
			System.out.println("--------------------");
		Arrays.stream(arr1).forEach(el->System.out.printf(el+" "));
		// 배열이라고 forEach를 무조건 사용할 수 있는 것은 아니라 Arrays.stream을 통해 사용가능하다.
		System.out.println("--------------------");
		Arrays.stream(arr1).forEach(System.out::print);
		// 출력만할거면 이렇게 하면된다고함. 추후에 배울거라고 하심
		
		// 배열에 입력된 값들 중 최소값/최대값을 출력하라.
		System.out.println();
		int max = arr1[0];
		int min = arr1[0];
		int sum = 0;
		for(int i=0; i<arr1.length;i++) {
			max = Math.max(max, arr1[i]);
			min = Math.min(min, arr1[i]);
			sum += arr1[i];
		}
		System.out.printf("max : %d, min : %d, avg = %f\n",max,min,(double)sum/arr1.length);
	}
}