package baekjoon.chap2;

import java.util.Scanner;

public class Q2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		if (A > B) {
			System.out.println(">");
		} else if (A < B){
			System.out.println("<");
		} else if (A == B) {
			System.out.println("==");
		}
		
	}

}
