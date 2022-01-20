package basic.star;

public class star08 {

	public static void main(String[] args) {
		// 반복문을 활용한 별로 그림 그리기
		/* 
		목표
		  ★
		 ★★★ 
		★★★★★
		 ★★★
		  ★
		*/
		
		int num = 5; // 줄의 개수
			for(int i = 0; i < num; i++) { 		// 세로 방향
				for(int j = 0; j < num; j++) {	// 가로 방향
					if(i <= num /2) { 			// 위쪽 부분(가운데 포함)
						if((i+j <= num /2-1) || (j - i >= num /2 +1)) {
							System.out.print(" ");
						} else {
							System.out.print("★");
						}
					} else if(i > num /2) {		// 아래 부분(가운데 미포함)
						if(i - j >= num /2 + 1) {
							System.out.print(" ");
						} else if(i + j >= num /2 * 3 + 1) {
							System.out.print(" ");
						} else {
							System.out.print("★");
						}
					}
				}
			System.out.println();
		}
	}

}
