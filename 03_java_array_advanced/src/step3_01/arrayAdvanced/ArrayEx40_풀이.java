package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 *	# 관리비
*/

public class ArrayEx40_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		
		for (int i = 0; i < pay.length; i++) {
			int total = 0;
			for (int j = 0; j < pay[i].length; j++) {		//
				total+= pay[i][j];  
			}
			System.out.println((i + 1) + ".층의 관리비 :" + total);
		}
		System.out.println();
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		
		
		System.out.print("호를 입력 : ");
		int num = scan.nextInt();
		
		int x = 0;
		int y = 0;
		
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt.length; j++) {
				if (num == apt[i][j] ) {
					x = i;
					y = j;
				}
			}
		}
		System.out.println("관리비를 출력 : " + pay[x][y]);
		System.out.println();
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int max = pay[0][0]; 				//변수 설정 pay 값으로 할것 . 
		int max1 = 0;
		int max2 = 0;
		int min = pay[0][0]; 
		int min1 = 0; 
		int min2 = 0; 
		
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (pay[i][j] > max ) {
					max = pay[i][j];
					max1 = i;
					max2 = j;
				}
				else if (pay[i][j] < min) {
					min = pay[i][j];
					min1 = i;
					min2 = j;
				}
			}
		}
		System.out.println("가장 많이 나온 집 " + apt[max1][max2] + "가장 적게 나온 집 " + apt[min1][min2]);
		
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		
		
		System.out.print("호1 입력 : ");
		int ho1 = scan.nextInt();
		System.out.print("호2 입력 : ");
		int ho2 = scan.nextInt();
		
		x = 0; 
		y = 0;
		
		int x1 =0 ;
		int y1 =0 ;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (ho1 == apt[i][j]) {
					x = i ;
					y = j ;
				}
				if (ho2 == apt[i][j]) {
					x1 = i;
					y1 = j;
				}
			}
		}
		int temp = pay[x][y]; 
		pay[x][y] = pay[x1][y1]; 
		pay[x1][y1] = temp; 
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay.length; j++) {
				System.out.print(pay[i][j] + " ");
			}
		System.out.println();          //행넘길려면 넣기 .
		}
		
		
	}

}
