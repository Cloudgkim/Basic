package basic.star;

public class star03 {

	public static void main(String[] args) {
		// 반복문을 활용한 별로 그림 그리기
		/*
		목표
		   ★
		  ★★
		 ★★★
		★★★★
		*/
		for(int i = 1; i < 5; i++) { // 행의 역할
			for(int j = 4; j > 0; j--) { // 열의 역할
				if(i < j) {
					System.out.print(" ");
				} else {
					System.out.print("★");
				}
			}
			System.out.println();
		}

	}

}
