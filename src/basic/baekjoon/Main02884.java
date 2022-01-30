package basic.baekjoon;

import java.util.Scanner;

public class Main02884 {
    
	public static void main(String[] args) {
		// 2. if문 5 - 2884 알람시계
		// 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)	
		
		Scanner sc = new Scanner(System.in);
        
        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();
        
        if(m < 45) {
            h--;
            m = 60 - (45-m);
            if(h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            m = m - 45;
            System.out.println(h + " " + m);
        }
            
	}
}

