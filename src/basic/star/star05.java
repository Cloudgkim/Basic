package basic.star;

public class star05 {

	public static void main(String[] args) {
		// 반복문을 활용한 별로 그림 그리기
		/*
		목표
		★★★★
		★★★
		★★
		★
		*/
		int lineNum = 4;
		for(int i = 0; i < lineNum; i++) {
			for(int j = 0; j < lineNum - i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}

}
