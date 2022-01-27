package basic.baekjoon;

import java.util.Scanner;

public class Main02588 {
    
    public static void main(String[] args){
    	// 1. 입출력과 사칙연산 13
    	// 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
    	
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println(a * (b % 10));
		System.out.println(a * ((b % 100) / 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
        
    }
}


