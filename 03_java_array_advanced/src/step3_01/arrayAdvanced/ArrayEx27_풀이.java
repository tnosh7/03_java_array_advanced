package step3_01.arrayAdvanced;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[2단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 4. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 5. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 */

public class ArrayEx27_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0,0,1,0,2,0,0,1,0};
		
		int me = 2; 
		int idx = 0; 
		
		while (true) {
			
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 2 ) System.out.print("읏");
				else System.out.print("_");
			}
			System.out.println();
			System.out.println("숫자를 입력(1~3) : ");
			idx = scan.nextInt();
			
			if (0 < idx || idx > game.length) {
				System.out.println("다시 입력하세요.");
				continue;			//예외처리 
			}
			if (idx == 1 ) {
				
				
			
	
		
				
			}
			
			
		}
	}
	
}
