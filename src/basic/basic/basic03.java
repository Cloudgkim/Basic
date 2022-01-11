package basic.basic;

public class basic03 {

	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + .....
		// 몇까지 더해나가야 누적된 값이 100이상이 되는가요?
		
		int sum		= 0; // 총합을 저장하는 변수
		int sign	= 1; // 값의 부호를 바꾸는데 사용할 변수
		int num		= 0; // 부호가 적용된 수에 사용할 변수
		
		System.out.println("첫번째 방법");
		for(int i = 1; true; i++,sign = -sign) { //sign => 1, -1, 1, -1, ...
			System.out.println("기호:" + sign);
			num = sign * i; //부호가 적용된 i값을 num에 저장한다.
			sum += num;
			
			if(sum >= 100) //총합이 100이상이면 반복문을 빠져나가자.
				break;
		}
		System.out.println("num:" + num + ", sum:" + sum);
		
		
		System.out.println("두번째 방법");
		for(int i = 1; sum < 100; i++, sign = -sign) {
			num = sign * i; // 부호가 적용된 i의 값을 num에 저장한다.
			sum += num;
		}
		System.out.println("num:" + num + ", sum:" + sum);
	}

}
