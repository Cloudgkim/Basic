package basic.basic;

public class basic16 {

	public static void main(String[] args) {
		// 1부터 20까지의 정수 중 3의 배수만 빼고 보여주시오.
		
		for(int num = 0; num <= 20; num++) {
			if(num % 3 == 0) continue; // continue => 아래에 있는 실행해야 하는 문장들을 건너 뛰고, 다음 반복을 시작한다.
			System.out.println(num);
		}

	}

}
