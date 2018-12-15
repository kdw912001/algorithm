package algorithm.ch1;

import java.util.Scanner;

public class Q14Q15 {

	private static Scanner sc = new Scanner(System.in); 
	public void q14() {
		System.out.println("사각형을 출력하는 프로그램입니다");
		System.out.print("단 입력 : "); 
		  
		int dan = sc.nextInt();
		for(int i=0;i<dan;i++) {
			for(int j=0; j<dan;j++) {
				System.out.print("*");
			}  
			System.out.println();  
		}
	}
	public static void triangleLB(int n) {
		for(int i=0; i<n;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangleLU(int n) {
		for(int i=0; i<n;i++) {
			for(int j=i; j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangleRU(int n) {
		for(int i=0; i<n;i++) {
			for(int j=0; j<n;j++) {
				if(i>j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void triangleRB(int n) {
		for(int i=0; i<n;i++) {
			for(int j=0; j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		/*Second se = new Second();
		se.q14();*/
		System.out.print("단 입력 : ");
		int n = sc.nextInt();
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		
	}

}
