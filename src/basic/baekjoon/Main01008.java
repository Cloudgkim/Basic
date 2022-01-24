package basic.baekjoon;

import java.util.Scanner;

public class Main01008 {
    
    public static void main(String[] args){
    	// 1. 입출력과 사칙연산 8
    	// ﻿첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.﻿
    	
        Scanner sc = new Scanner(System.in);
        
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        
        System.out.print(a/b);
        
    }
}


