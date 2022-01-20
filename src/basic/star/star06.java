package basic.star;

public class star06 {

	public static void main(String[] args) {
		// 반복문을 활용한 별로 그림 그리기
		/*
		목표
		  ★★★★★
		   ★★★★
		    ★★★
		     ★★
		      ★
		*/
		int lineNum = 5;
		
		System.out.println("첫번째 방법");
		for(int i = 0; i < lineNum; i++) {
			//공백을 하나씩 늘려나가면서 그린다.
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//위에서 공백을 먼저 출력하고 난 다음에 *을 그린다.
			for(int j = 0; j < lineNum-i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("두번째 방법");
		for(int i = 5; i > -1; i--) {
			for(int j = 5; j > 0; j--) {
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
