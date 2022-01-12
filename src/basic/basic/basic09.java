package basic.basic;

public class basic09 {

	public static void main(String[] args) {
		// 1~100 사이의 임의의 정수를 구한다.
		// Math.random() 			=> 0 ~ 0.0000000
		// Math.random() * 100 		=> 0 ~ 99.9999999
		// Math.random() * 100 + 1	=> 1 ~ 100.9999999
		// (int)(Math.random() * 100 + 1) => 1 ~ 100
		
		int answer = (int)(Math.random() * 100 + 1); // 문제
		System.out.println(answer);
		
		int input = 0; // 사용자가 입력하는 값을 저장할 변수
		int count = 0; // 정답을 맞추기 위해 입력한 횟수
		
		// 화면으로부터 사용자의 입력을 받기 위해 Scanner클래스를 사용한다ㅣ.
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println("1부터 100 사이의 정수를 입력하세요.");
			
			input = keyboard.nextInt(); // 내가 입력한 값
			
			if(input > 100 || input < 1) {
				System.out.println("1부터 100사이의 정수를 입혁하세요.");
				count--;
				continue;
			}
			
			// 정답과 내가 입력한 값에 대하여 메시지로 처리한다.
			if(input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("정답입니다.");
				System.out.println("축하합니다! " + count + "번만에 맞추셨습니다.");
				break;
			}
		} while(true);
		
	}

}
