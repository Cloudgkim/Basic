package basic.star;

public class star02 {

	public static void main(String[] args) {
		// 반복문을 활용한 별로 그림 그리기
		/*
		목표
		★
		★★
		★★★
		★★★★
		*/
		for(int i = 0; i < 4; i++) { // 행의 역할
			for(int j = 0; j < i+1; j++) { // 열의 역할
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
