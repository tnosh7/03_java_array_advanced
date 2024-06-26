package step3_01.arrayAdvanced;


/*
 *	# 2차원배열 기본문제[3단계]
*/

public class ArrayEx39_풀이 {

	public static void main(String[] args) {
		
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		}; 
		
		int[] garo = new int[3];
		int[] sero = new int[4];
		
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				garo[i] += arr[i][j];		//행
				sero[j] += arr[i][j] ; 		//열 
			}
		}
		for (int i = 0; i < garo.length; i++) {
			System.out.print(garo[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < sero.length; i++) {
			System.out.print(sero[i] + " ");
		}
		
		
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[j].length; j++) {
				garo[i] = arr[i][j];
				sero[j] = arr[i][j];
			}
		}

	}

}
