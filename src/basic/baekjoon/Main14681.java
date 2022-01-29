package basic.baekjoon;

import java.util.Scanner;

public class Main14681 {
    
	public static void main(String[] args) {
		// 2. if문 4 - 14681 사분면 고르기
		// ﻿점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		
        Scanner sc = new Scanner(System.in);
        
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        
        if(x > 1) {
            if(y >= 1) {
                System.out.println("1");    
            }
            if(y <= 1) {
                System.out.println("4");
            }
        } else if(x <= 1) {
            if(y >= 1) {
                System.out.println("2");
            }
            if(y <= 1) {
                System.out.println("3");
            }
        }
            
	}
}

