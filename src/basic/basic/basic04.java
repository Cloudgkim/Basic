package basic.basic;

public class basic04 {

	public static void main(String[] args) {
		// 2개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 구하시오.
		// 정답 : 1-5, 2-4, 3-3, 4-2, 5-1
		
		for(int i = 1; i <= 6; i++) { // 첫번째 주사위
			for(int j = 1; j <= 6; j++) { // 두번째 주사위
				if(i+j == 6)
				System.out.println(i + "+" + j + "=" + (i+j));
			}
		}

	}

}
