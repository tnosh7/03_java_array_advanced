package step3_01.arrayAdvanced;

import java.util.Random;
import java.util.Scanner;

//# 빙고 Ver2(플레이어 2명)

public class ArrayEx46_문제_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int maxNum = 5;
		
		
		int size = 50;
		
		int[][] me  = new int[maxNum][maxNum];
		int[][] you = new int[maxNum][maxNum];
		
		int[][] meMark  = new int[maxNum][maxNum];
		int[][] youMark = new int[maxNum][maxNum];

		int[] temp = new int[maxNum*maxNum];
		
		int win = 0;
		int turn = 0;
		int p1X = 0;	int p1Y = 0;
		int p2X = 0;	int p2Y = 0;
		
		// me 셋팅
		for (int i = 0; i < temp.length; i++) {
			temp[i] = ran.nextInt(size) + 1 ;
			for (int j = 0; j < i; j++) {
				if (temp[i]==temp[j]) {
					i--;
				}
			}
		}
		
		int k = 0;
		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				me[i][j] = temp[k];
				k++;
			}
		}
		
		// you 셋팅
		for (int i = 0; i < temp.length; i++) {
			temp[i] = ran.nextInt(size) +1;
			for (int j = 0; j < i; j++) {
				if(temp[i] == temp[j]) {
					i--;
				}
			}
		}
		k = 0;
		
		for (int i = 0; i < maxNum; i++) {
			for (int j = 0; j < maxNum; j++) {
				you[i][j] = temp[k];
				k++;
			}
		}
		
		//문제 출력 너나 
		while (true) {
			
			System.out.println("===빙고 게임===");
			for (int i = 0; i < maxNum; i++) {
				for (int j = 0; j < maxNum; j++) {
					if(meMark[i][j]==0) {
						System.out.print(i + "\t");
					}
					else if {	
						System.out.println("O\t");
					}
				}
			}
			
			for (int i = 0; i < maxNum; i++) {
				System.out.print(i + "\t");
			}
			System.out.println("\t");
		}
		
		//승리조건 출력 
			
		
		
			 
			// 승패결정 가로 체크
			
			
			// 승패결정 세로 체크
		
			// 승패결정 대각선 체크
						
			// 승패결정 대각선 체크
			
	}

}
