package basic.baekjoon;

import java.util.Scanner;

public class Main02742 {

	public static void main(String[] args) {
		// 3. for문 6 - 2742 기찍 N
		// ﻿첫째 줄부터 N번째 줄 까지 차례대로 출력한다
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
        
		int i = 1;
        
		while(i <= n) {
			System.out.println(i);
			i++;
		}
	}
}


//﻿BufferReader - System.println.out﻿
//﻿import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
// 
//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		br.close();
//        
//		while( n > 0 ) {
//			System.out.println(n);
//			n--;
//		}	
//	}
//}
//
//﻿BufferReader - StringBuilder
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
// 
//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		br.close();
//        
//		StringBuilder sb = new StringBuilder();
//        
//		while(n > 0) {
//			sb.append(n + "\n");
//			n--;
//		}
//		System.out.println(sb);
//	}
//}
// 
//
//BufferedReader - BufferedWriter
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.io.BufferedWriter;
//import java.io.OutputStreamWriter;
// 
//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        
//		int n = Integer.parseInt(br.readLine());
//		br.close();
//        
//        
//		while(n > 0) {
//			bw.write(n+"\n");
//			n--;
//		}
//		bw.flush();
//		bw.close();
//	}
//}