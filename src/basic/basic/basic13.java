package basic.basic;

public class basic13 {

	public static void main(String[] args) {
		// 1부터 10,000까지의 정수들에는 8이라는 숫자가 몇 번 나오나요?
		// 8888 => 4번으로 계산한다.
		// 정답 : 4,000번
		
		int count = 0; 	// 8이라는 숫자의 횟수를 누적하는 변수
		int wonbon = 0; // 작업할 대상이 되는 숫자를 저장할 변수
		
		// 1부터 10000까지 숫자를 대상으로 작업한다.
		
		for(int i = 1; i <= 10000; i++) {
			wonbon = i; // 작업대상이 되는 숫자를 보존한다.
		
			while(i >= 10) {
				if(i % 10 == 8) {
					count++;
					i /= 10; //1단위 계산이 끝났으므로 1단위를 잘라낸다.
				} else { 
					i /= 10;
				}
			}
			if(i == 8) {
				count++;
			}
			i = wonbon;
		}
		System.out.println("1~10000까지 8이라는 숫자가 나오는 횟수 : " + count); 
		System.out.println("=============================================");
		
		count = 0; 	// 8이라는 숫자의 횟수를 누적하는 변수
		wonbon = 0; // 작업할 대상이 되는 숫자를 저장할 변수
		for(wonbon = 1; wonbon <= 10000; wonbon++) {
			for(int y = wonbon; y != 0; y /=10) {
				if(y % 10 == 8)
					count++;
			}
		}
		System.out.println("1~10000까지 8이라는 숫자가 나오는 횟수 : " + count); 
		System.out.println("=============================================");
		

	}

}
