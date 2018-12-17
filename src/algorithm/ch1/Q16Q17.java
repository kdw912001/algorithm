package algorithm.ch1;

import java.util.Scanner;

public class Q16Q17 {
	
	public static void spira(int n) {
		for(int i=0; i<n;i++) {
			for(int k=i;k<n-1;k++) {
				//n  i	공백
				//1  0	0
				//2  0	1
				//	 1  0
				//3	 0  2
				//   1	1
				//	 2  0 
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1;j++) {
				//i 별 갯수
				//0  1
				//1  3
				//2  5
				//3  7     -> 2*i+1
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void npira(int n) {
		for(int i=0; i<n;i++) {
			for(int k=i;k<n-1;k++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1;j++) {
				System.out.print(i+1);//해당 행+1
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		spira(dan);
		npira(dan);
		//10단이 넘어가고 100단이 넘어가고 1000단이 넘어간다면
		//그 변화가 있을 때마다 공백문자를 더 출력하게 설정하면 될 듯 
	}
}
