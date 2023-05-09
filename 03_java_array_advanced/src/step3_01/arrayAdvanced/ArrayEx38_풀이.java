package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_풀이 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {		//값 출력용.
				System.out.print(arr[i][j] + " ");
			}
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		
		System.out.print("인덱스1 입력 : ");
		int idx1 = scan.nextInt();
		System.out.print("인덱스2 입력 : ");
		int idx2 = scan.nextInt();
		
		System.out.println(arr[idx1][idx2]);
		 
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		
		System.out.println("값 입력 : "); 
		int data = scan.nextInt();
		
		idx1 = 0;
		idx2 = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == data) {
					idx1 = i ;
					idx2 = j ;
				}
			}
		}
		System.out.print("인덱스1 출력 : " + idx1);
		System.out.print(" " + "인덱스2 출력 : " + idx2);
		System.out.println();
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = 0; 
		idx1 = 0;
		idx2 = 0; 
		
		System.out.print("가장 큰 값의 인덱스 : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.print(idx1 + " " + idx2);
		
		System.out.println();
		
		// 문제 4) 값 2개를 입력받아 값 교체
		
		System.out.println("값1 입력 : ");
		int num1 = scan.nextInt();
		System.out.println("값2 입력 : ");
		int num2 = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (num1 == arr[i][j]) {
					arr[i][j] = num2; 
				}
				else if (num2 == arr[i][j]) {
					arr[i][j] = num1; 
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		

	}

}
