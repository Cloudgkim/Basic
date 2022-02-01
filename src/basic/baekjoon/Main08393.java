package basic.baekjoon;

import java.util.Scanner;

public class Main08393 {
    
	public static void main(String[] args) {
		// 3. for문 3 - 8393 합
		// 1부터 n까지 합을 출력한다.	
		
		Scanner sc = new Scanner(System.in);
		 
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
        
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
