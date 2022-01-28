package basic.baekjoon;

import java.util.Scanner;

public class Main01330 {
    
	public static void main(String[] args) {
		// 2. 입출력과 사칙연산 1
    	// 첫째 줄에 다음 세 가지 중 하나를 출력한다.
		// - A가 B보다 큰 경우에는 '>'를 출력한다.
		// - A가 B보다 작은 경우에는 '<'를 출력한다.
		// - A와 B가 같은 경우에는 '=='를 출력한다.

		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		sc.close();
		
		if(a > b) 
		    System.out.println(">");
		if(a < b) 
		    System.out.println("<");
		if(a == b)
		    System.out.println("==");

    }
}


