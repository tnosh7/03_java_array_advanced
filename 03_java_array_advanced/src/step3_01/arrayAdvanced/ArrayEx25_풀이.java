package step3_01.arrayAdvanced;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 -1로 변경한다.
 * 3. arr배열의 모든 값이 -1로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, -1, 24
 * 입력 : 87
 * 
 * 11, -1, 42, -1, 24
 * 
 */
// 1, 입력  2. 값 바꾸기  3. 겹치지 않게.  

public class ArrayEx25_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		int cnt = 0;
		
		while (true) {
			
			System.out.println(Arrays.toString(arr));
			
			int arrMax = 0;							// while문 안에 위치/ ? 
			int arrIdx = 0; 
			for (int i = 0; i < arr.length; i++) {
				if (arrMax < arr[i]) {
					arrMax = arr[i]; 
					arrIdx = i; 
				}
			}
			System.out.println("최대값 입력 : ");
			int maxNum = scan.nextInt();
			
			if (maxNum == arrMax) {
				arr[arrIdx] = -1;
				cnt++;
			}
			if (cnt == 5)
				break;
		} 
	
		
		
		
		
		
		
	
	}
}
