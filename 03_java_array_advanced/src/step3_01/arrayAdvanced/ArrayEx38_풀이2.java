package step3_01.arrayAdvanced;

import java.util.Scanner;

/**24-05-30
 * 2차원배열 기본문제[2단계]
 * @author 윤성희
 *
 */
/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_풀이2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		Scanner scan = new Scanner(System.in);
		System.out.print("인덱스 1 입력 : ");
		int index1 = scan.nextInt();
		System.out.print("인덱스 2 입력 : ");
		int index2 = scan.nextInt();
		System.out.println("값 출력 : " + arr[index1][index2]);
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.print("값 입력 : ");
		int num = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (num == arr[i][j]) {
					System.out.println("인덱스1 출력 : " + i + " 인덱스2 출력 : " + j);
				}
			}
		}
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = arr[0][0];
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("인덱스1 : " + idx1 + "\t인덱스2 : " + idx2);
		// 문제 4) 값 2개를 입력받아 값 교체
		int i1 = 0; 
		int j1 = 0;
		int i2 = 0; 
		int j2 = 0;
		int data1 = 0;
		int data2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == data1) {
					i1 = i;
					j1 = j;
				}
				if (arr[i][j] == data2) {
					i2 = i;
					j2 = j;
				}
			}
		}
		int temp = arr[i1][j1];
		arr[i1][j1] = arr[i2][j2];
		arr[i2][j2] = temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
