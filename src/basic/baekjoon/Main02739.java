package basic.baekjoon;

import java.util.Scanner;

public class Main02739 {
    
	public static void main(String[] args) {
		// 3. for문 1 - 2739 구구단
		// 출력형식과 같게 N*1부터 N*9까지 출력한다.	
		
		Scanner sc = new Scanner(System.in);
        
        int n;
        n = sc.nextInt();
      
        for(int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
	}
}

