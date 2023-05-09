package step3_01.arrayAdvanced;
/*
 * # 사다리 게임
 * 
 * 1. 0을 만나면 아래로 내려간다.
 * 2. 1일 때에는 좌우를 검사해 1인 쪽으로 이동 후 아래로 내려간다.
 * 3. x의 위치를 입력받고 사다리를 표현한다.
 * 		x = 0	x = 4
 * 		x = 1	x = 2
 * 		x = 2	x = 1
 * 		x = 3	x = 3
 * 		x = 4	x = 0
 */

import java.util.Scanner;

public class ArrayEx41_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] ladder = {
				{0,0,0,0,0},
				{1,1,0,1,1},
				{0,1,1,0,0},
				{0,0,1,1,0},
				{1,1,0,0,0},
				{0,1,1,0,0},
				{1,1,0,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0}
		};
		
		int x = 0; 												//
		int y = 0; 
		
		for (int i = 0; i < ladder.length; i++) {				//for문 사다리배열 길이 만큼 	
			for (int j = 0; j < ladder[i].length; j++) {		// 특수문자 : ㅂ + 한자	// 2중배열
				if (ladder[i][j] == 0) {						//사다리 ==> 0 일때 -> 막대ㅣㄱ
					System.out.print(" │ ");					//	
				}
				else if (ladder[i][j] == 1) {					//1일떄
					if (j != 0 && ladder[i][j-1] == 1) {		//열이 0이 아니거나ㅏ -1한 값이 1일때  
						System.out.print("─┤ ");//-1??? 왜하ㅣ징? =>맨마지막행은 작대기만 나옴 .
					}
					else if (j != ladder[i].length - 1 && ladder[i][j+1] == 1){	//열이 사다리 행길이가 아닐때 -1한값 + 1한값= 1
						System.out.print(" ├─");				//j+1?? 			
					}
				}
			}
			System.out.println();
		}
		//여기까지 문제 만들기 . 
		System.out.print("0~4 입력 : ");			//입력 
		x = scan.nextInt();							
		
		for (int i = 0; i < ladder.length; i++) {		//x y 구분 잘하기	
			if (ladder[y][x] == 0) {						
				y++;							//0이면 y쪽으로 내려감 
			}
			else if (ladder[y][x] == 1) {				//위에 else if 문이랑 같음 
				if (x != 0 && ladder[y][x-1] == 1) {		 
					x--;									//왼쪽끝
				}
				else if(x != 4 && ladder[y][x+1] == 1) {	//오른쪽 끝 
					x++;
				}
				y++;	//else if 문 안에 
			}
		}
		
		System.out.println("x = " + x);
		//System.out.println("y = " + y);

		scan.close();

	}

}
