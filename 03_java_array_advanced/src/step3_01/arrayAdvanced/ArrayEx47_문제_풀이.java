package step3_01.arrayAdvanced;

import java.util.Random;
import java.util.Scanner;

// # 소코반

public class ArrayEx47_문제_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		final int SIZE = 7;
		final int PLAYER = 2;
		final int BALL = 3;
		final int GOAL = 7;
		final int WALL = 9;
		
		int[][] map = new int[SIZE][SIZE];
		
		int wallCount = 0;
		int pY = 0;
		int pX = 0;
		int ballY = 0;
		int ballX = 0;
		int goalY = 0;
		int goalX = 0;
		
		// 벽 설치
		System.out.print("설치할 벽 개수 입력 : ");
		wallCount = scan.nextInt();
		
		int tmp = wallCount;
		
		while (tmp != 0) {
			int rY = ran.nextInt(SIZE);
			int rX = ran.nextInt(SIZE);
			
			if (map[rY][rX] == 0) {
				map[rY][rX] =1;
				tmp = tmp -1;
			}
		}
		
		
		// 공 설치
		while (true) {
			int rY =ran.nextInt(SIZE-2)+1;
			int rX =ran.nextInt(SIZE-2)+1;
			
			if(map[rY][rX]== 0) {
				
			}
		}
	
		// 골대 설치
		while
		
		// 화면 출력
	
		// 플레이어 배치
	
		
		// 게임 시작
		
			// 골대에 공을 넣으면 게임 종료
			
		
			// 현재위치 저장하기
			
			
			// 예외처리
			
			// 공을 만나면
			

				// 예외처리
				
				// 공 이동시키기
				
			
			// 캐릭터 이동시키기
			

		scan.close();
		
	}

}
