package step3_01.arrayAdvanced;

/*
 *	# 2차원배열 기본문제[1단계]
*/

public class ArrayEx37_풀이 {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k++;
			}
		}
		
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		
		int total = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j]; 
			}
		}
		System.out.println("합 : " + total);
		
		
		
		
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80 
		
		int cnt4 = 0;
		
		System.out.print("4의 배수 : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					cnt4 = arr[i][j];
					System.out.print(cnt4 + " ");
				}
			}
		}
		System.out.println();
		
		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		
		int cnt4total = 0;
		System.out.print("4의 배수 합 : ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					cnt4total += arr[i][j];
				}
			}
		}
		System.out.print(cnt4total);
		System.out.println();
		
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		
		int cnt = 0;
		System.out.print("4의 배수의 개수 : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 4 == 0) {
					cnt++;
				}
			}
		}
		System.out.print(cnt);

	}

}
