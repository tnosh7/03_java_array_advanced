package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 * 
 * # 나만의 마블
 * 
 * 옷 □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 * 
 */

public class ArrayEx42_문제_풀이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		final int ROAD = 20;	//20변수값 = > 중간에 네모네모빔 
		
		int[][] map = {
			{0,   1,  2,  3, 4},	 //첫행합-> 마지막열-> 마지막행-> 첫열
			{15, 20, 20, 20, 5},
			{14, 20, 20, 20, 6},
			{13, 20, 20, 20, 7},
			{12, 11, 10,  9, 8}
		};
		
		int player = 0; //초기값 -->플레이어 위치 
		
		while (true) {
			
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if(map[i][j]== 20) {
						System.out.print(" ■ ");
					}
					else if(map[i][j]==player) {
						System.out.print(" P ");
					}
					else System.out.print(" □ ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("이동 범위(1~3) : ");
			int move = scan.nextInt();
			player = player + move;
			player %= 16;					
		}
		
		
	}

}
