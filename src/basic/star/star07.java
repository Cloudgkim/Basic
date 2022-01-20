package basic.star;

public class star07 {

	public static void main(String[] args) {
		// 반복문을 활용한 별로 그림 그리기
		/* 
		목표
		★   ★
		 ★ ★ 
		  ★  
		 ★ ★
		★   ★
		*/
		int lineNum = 7;
		for(int i = 0; i < lineNum; i++) {
			for(int j = 0; j < lineNum; j++) {
				if((i == j) || (i + j == lineNum -1)) {	// 좌상단에서 우하단/우상단에서 좌하단으로 그린다.
					System.out.print("★");
				} else {					// 그 외에는 모두 공백으로 그린다.
					System.out.print(" ");
				}
			}
			System.out.println(); // 한 줄에 대한 작업이 끝나면 줄을 바꾼다.
		}
		
	}

}
