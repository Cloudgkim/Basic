package basic.baekjoon;

import java.util.Scanner;

public class Main11021 {
		
	public static void main(String[] args) {
		// 3. for문 7 - 11021 A+B - 7
		// 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		 
		Scanner sc = new Scanner(System.in);
 
		int t = sc.nextInt();
 
		for (int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
 
			System.out.println("Case #" + i + ": " + (a + b));
		}
 
		sc.close();
	}
}

