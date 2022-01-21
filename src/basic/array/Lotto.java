package basic.array;

public class Lotto {

	public static void main(String[] args) {
		// 1부터 45까지의 정수 중에서 6개의 수를 추출한다.
		
		// 배열은 6개만 사용한다. int[] ball = new int[6];
		// 단, 추출한 6개의 수가 중복되면 안된다. => 중복된 수가 나올 때는 어떻게 처리할까?
		
		int[] ball  = new int[6];
		
		System.out.println("정수 6개 추출하기");
		for(int i = 0; i < ball.length; i++) {
			ball[i] = (int)(Math.random() * 45 + 1);
						
			// i가 0인 경우는 비교할 방이 없다.
			if(i > 0) {
				for(int j = 0; j < i; j++) { // 현재 순서의 앞방들하고만 비교하면 된다.
					if(ball[j] == ball[i]) { // 지금 찾은 번호와 앞방들 중 누군가와 번호가 같다면
						//숫자를 다시 추출한다
						//ball[i] = (int)(Math.random() * 45 + 1);
						i--;
					}
				}
			}
		}
		
				
		for(int i = 0; i < ball.length; i++)
			System.out.print(ball[i]+ "\t");
		System.out.println();
		
		// 중복되지 않은 6개의 수를 오름차순으로 보여준다.
		// 2장씩 비교하므로 방크기 -1 만큼만 반복하면 된다.
		System.out.println("오름차순으로 정렬");
		for(int i = 0; i < ball.length-1; i++) {
			for(int j = 0; j < ball.length-1-i; j++) {
				if(ball[j] > ball[j+1]) { // 왼쪽 방의 값이 더 크면, 값을 교환한다.
					int imsi	= ball[j];
					ball[j]		= ball[j+1];
					ball[j+1]	= imsi;	
				}
			}
		}
		for(int i = 0; i < ball.length; i++)
			System.out.print(ball[i]+ "\t");
		
		
			
	}

}
