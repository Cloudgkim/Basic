package basic.star;

public class star04 {

	public static void main(String[] args) {
		// 반복문을 활용한 별로 그림 그리기
		/*
		목표
		   ★
		  ★★★
		 ★★★★★
		★★★★★★★
		*/
		int LineNum = 10; //줄 수
		for(int i = 0; i < LineNum; i++) { // 줄 수
			for(int j = 0; j < LineNum -i -1; j++) {
				//LineNum -i, -1에서 -1을 한 이유는 i가 0부터 시작했기 때문에
				System.out.print(" ");
			}
			// 1, 3, 5, ...순으로 ★을 그린다. 1부터 시작해서 2씩 증가시킨다.
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

	}

}
