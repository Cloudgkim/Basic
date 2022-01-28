package basic.baekjoon;

import java.util.Scanner;

public class Main09498 {
    
	public static void main(String[] args) {
		// 2. if문 2
		// ﻿시험 성적을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int sum;
		sum = sc.nextInt();
		
		if(sum >= 90) {
		    System.out.println("A");
		} else if(sum >= 80) {
		    System.out.println("B");
		} else if(sum >= 70) {
		    System.out.println("C");
		} else if(sum >= 60) {
		    System.out.println("D");
		} else {
		    System.out.println("F");
		}
        
    }
}


