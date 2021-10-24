package baekjoon.chap2;

import java.util.Scanner;

public class Q2_5 {
	public static void main(String[] args) {
		// 입력한 시간보다 45분 빠른 알람시간을 출력한다.  
		// H는 0보다 크거나 같고 23보다 작거나 같다.
		// M은 0보다 크거나 같고 59보다 작거나 같다.
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();//시간
		int M = scanner.nextInt();//분
		
		scanner.close();
		
		if(M < 45) {// M이 45분보다 작을 때 
			H--;	// -- : 1씩 감소, ++ : 1씩 증가
//			System.out.println(H);
			M = 60-(45-M); // 1시간이 감소되면서 60분이 증가했으므로 기준값(45분)에서 입력값(M분)을 뺀다.
//			System.out.println(M);
			if (H < 0) { // 0시 보다 작을 때 
				H = 23;  // 24시가 0시이므로 H는 23시이다.
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M-45));
		}
	}	
}
