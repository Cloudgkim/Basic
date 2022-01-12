package basic.basic;

public class basic08 {

	public static void main(String[] args) {
		// 회문수 판단 프로그램
		// Palindrome(회문수) : 숫자를 거꾸로 읽어도 앞으로 읽은 숫자와 같은 수
		// 12321, 111111, 1223333221 등
		
		// number가 회문수인가요? 아닌가요? (정답 : 아니다.)
		int number	= 12343; // 문제. 회문수라면, number - result == 0
		int imsi	= number;
		int result	= 0; // 변수 number의 값을 거꾸로 만들어 저장할 변수
		
	while(imsi != 0) {
		System.out.println("imsi : " + imsi);
		result = result * 10 + imsi % 10;
		imsi /= 10;
	}
	System.out.println(imsi + " : " + result);	
	
	if(number == result)
		System.out.println(number + "는 회문수입니다.");
	else
		System.out.println(number + "는 회문수가 아닙니다.");
	}

}
