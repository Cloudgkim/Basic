package basic.basic;

public class basic10 {

	public static void main(String[] args) {
		// 구구단
		for(int x = 1; x <= 9; x++) {
			for(int y = 1; y <= 9; y++) {
				System.out.print(x + "x" + y + "=" + (x*y) + "\t");
			}
			System.out.println();
		}

		// 구구단을 출력하는데
		// 1, 2, 3단을 출력하고 4, 5, 6단을 출력하고 7, 8, 9단을 출력하자
		// 첫번째 방법
		System.out.println();
		System.out.println("구구단 3단씩 묶어서 보여주는 방법");
		// i :  행이 크게 3묶음이고,
		//		각 묶음의 첫 숫자는 1부터 시작해서 3씩 증가시킨다.(1, 4, 7)
		// y :	한 묶음 안에서 행이 9번 실행된다.
		// x :	i의 값(1, 4, 7)을 가지고 각 묶음당 123. 456, 789순으로 실행한다.
		
		for(int i = 1; i <=9; i = i+3) {
			for(int y = 1; y <=9; y++) {
				for(int x = i; x < i+3; x++) {
					System.out.print(x + "x" + y + "=" + (x*y) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
