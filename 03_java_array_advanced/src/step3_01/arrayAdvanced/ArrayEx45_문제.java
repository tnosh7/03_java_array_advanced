package step3_01.arrayAdvanced;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver1(플레이어 1명)             

public class ArrayEx45_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		int[][] bingo = new int[maxNum][maxNum];//빙고게임문제 출력용
		int[][] mark = new int[maxNum][maxNum];	//내가 선택한 인덱스 확인용
		int[] temp = new int[maxNum*maxNum];	//25
		int size = 50;	
		int win = 0;							//승리변수
		
		// 중복을 제거한 랜덤숫자를 임시 저장
		for (int i=0; i < temp.length; i++) {
			temp[i] = ran.nextInt(size) + 1;	//1~51
			for (int j = 0; j < i; j++) {		//
				if (temp[i] == temp[j]) {
					i--;						//숫자같으면 인덱스 --해즘 		
				}
			}
		}
		
		// 중복을 제거한 랜덤숫자를 빙고판에 대입
		int k = 0;								//k= 차례대로 데이터 넣을 변수.											
		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {	
				bingo[i][j] = temp[k];			//빙고배열에 랜덤 숫자 넣기 
				k++;							//++해주깅ㄱ
			}
		}
		
		
		
		while (true) {															
			System.out.println("=============== BINGO GAME ===============");
			System.out.print("\t");						//tab 	
			for (int i = 0; i < maxNum; i++) {			
				System.out.print(i + "\t");				//상단 0~4 
			}
			System.out.println("\n");
			//한줄ㄷ							
			for (int i = 0; i < maxNum; i++) {			
				System.out.print(i + "\t");				//0~4 
				for (int j = 0; j < maxNum; j++) {			
					if (mark[i][j] == 0) {				//랜덤숫자 출력		//mark배열에 데이터 안넣었음. 초깃값임.			
						System.out.print(bingo[i][j] + "\t");	
					}
					else {
						System.out.print("O\t");		//대문자O 탭해줌?
					}
				}
				System.out.println("\n");				//줄바꿈
			}

			if (win == 1) {
				System.out.println("게임종료");
				break;
			}
			
			System.out.print("y좌표 입력 : ");			//입력 
			int meY = scan.nextInt();
			System.out.print("x좌표 입력 : ");
			int meX = scan.nextInt();
			
			if (mark[meY][meX] == 0) {					//초깃값 0이면 
				mark[meY][meX] = 1;						//1로 바꿔서 플레이어 선택된 인덱스 확인시킴
			}
			
			// 가로검사
			for (int i = 0; i < maxNum; i++) {			//i -> j		
				int cnt = 0;							//cnt변수					
				for (int j = 0; j < maxNum; j++) {
					if (mark[i][j] == 1) {				//선택된 인덱스면 cnt증가 	
						cnt++;						
					}
				}
				if (cnt == 5) {						
					win = 1;
					break;
				}
			}
			
			// 세로검사
			for (int j = 0; j < maxNum; j++) {			//j -> i
				int cnt = 0;							//cnt
				for (int i = 0; i < maxNum; i++) {
					if (mark[i][j] == 1) {
						cnt++;
					}
				}
				if (cnt == 5) {
					win = 1;
					break;
				}
			}
			
			// 대각선 검사								//break없ㅇ므.
			int cnt = 0;								//cnt				
			for (int i = 0; i < maxNum; i++) {			//i -> i		
				if (mark[i][i] == 1) {					//대각선(왼-오)
					cnt++;
				}
			}
			if (cnt == 5) {
				win = 1;
			}
												
			cnt = 0;									//cnt
			for (int i = 0; i < maxNum; i++) {			//mark[0~4][4-(0~4)] ==1?				
				if (mark[i][(maxNum-1)-i] == 1) {		//0,1,2,3,4	/ 4,3,2,1,0 /대각선(오-왼)
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
