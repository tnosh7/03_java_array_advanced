package step3_01.arrayAdvanced;

import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver1(플레이어 1명)

public class ArrayEx45_문제_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		int[][] bingo = new int[maxNum][maxNum];
		int[][] mark = new int[maxNum][maxNum];	
		int[] temp = new int[maxNum*maxNum];
		int size = 50;	
		int win = 0;
		
		// 중복을 제거한 랜덤숫자를 임시 저장
		for (int i = 0; i < temp.length; i++) {
			temp[i] = ran.nextInt(size) + 1; 
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i--;
			}
		}
		// 중복을 제거한 랜덤숫자를 빙고판에 대입
		int k = 0 ;
		for (int l = 0; l < maxNum; l++) {
			for (int j = 0; j < maxNum; j++) {
				bingo[l][j] = temp[k] ;
				k++;
			}
		}
	
		//문제출력 
		
		while(true) {
			System.out.println("===========BINGO GAME============");
			System.out.println("\t");
			
			for (int j = 0; j < maxNum; j++) {
				System.out.print(j + "\t");
			}
			System.out.println("\t");
		
			
			for (int i = 0; i < maxNum; i++) {
				System.out.print(i + "\t");
				for (int j = 0; j < maxNum; j++) {
					if (mark[i][j] == 0) {
						System.out.print(bingo[i][j] + "\t");
					}
					else {
						System.out.print("O\t");
					}
				}
				System.out.println("\n");
			}
		//승리조건 
			if (win == 1) {
				System.out.println("게임종료");
				break;
			}
		//입력 
			System.out.println("y 좌표입력 : ");
			int meY = scan.nextInt();
			
			System.out.println("x 좌표입력 : ");
			int meX = scan.nextInt();
			
			if (mark[meY][meX] == 0) {
				mark[meY][meX] = 1;
			}
			
			// 가로검사
		
			for (int i = 0; i < maxNum; i++) {
				int cnt = 0;
				for (int j = 0; j < maxNum; j++) {
					if (mark[i][j] ==1) {
						cnt++;
					}
				}
				
				if (cnt == 5) {
					win = 1;
					break;
				}
			}
			// 세로검사
			for (int j = 0; j < maxNum; j++) {
				int cnt = 0;
				for (int i = 0; i < maxNum; i++) {
					if( mark[i][j] == 1 ) {
						cnt++;
					}
				}
				if (cnt == 5) {
					win = 1;
					break;
				}
			}
			
			// 대각선 검사
			int cnt = 0;
			for (int i = 0; i < maxNum; i++) {
				if (mark[i][i] == 1) {
					cnt++;
					}
				}
				if (cnt == 5) {
					win = 1;
					break; 
				}
			}
			
			int cnt =0;
			for (int i = 0; i < maxNum; i++) {	//01234 43210
				if(mark[i][(maxNum-1)-i] == 1 ) {
					cnt++;
				}
			}
			if (cnt == 5) {
				win = 1;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	

		scan.close();
	}

}
