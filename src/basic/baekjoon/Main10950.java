package basic.baekjoon;

import java.util.Scanner;

public class Main10950 {
    
	public static void main(String[] args) {
		// 3. for문 2 - 10950 A+B - 3
		// 각 테스트 케이스마다 A+B를 출력한다.	
		
		Scanner sc = new Scanner(System.in);
		 
		int t = sc.nextInt();
		int arr[] = new int[t];
 
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a + b;
		}
		sc.close();
 
		for (int k : arr) {
			System.out.println(k);
		}
	}S
}
