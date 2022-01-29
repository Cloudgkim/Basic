package basic.baekjoon;

import java.util.Scanner;

public class Main02753 {
    
	public static void main(String[] args) {
		// 2. if문 3 - 2753 윤년
		// ﻿첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
        int year;
        year = sc.nextInt();
        
        if(year%4 == 0 && year%100 != 0) {
            System.out.println("1");
        } else if(year%400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}


