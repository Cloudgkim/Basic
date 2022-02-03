package basic.baekjoon;

import java.util.Scanner;

public class Main02741 {

	public static void main(String[] args) {
		// 3. for문 5 - 2741 N 찍기
		// 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
		
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
//		int N = Integer.parseInt(br.readLine());
//		br.close();
//        
//		int i = 1;
//        
//		while(i<= N) {
//			bw.write(i+"\n");
//			i++;
//		}
//		bw.flush();
//		bw.close();
//	}
//}


