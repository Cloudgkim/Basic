package basic.basic;

public class basic06 {

	public static void main(String[] args) {
		// 정수의 각 단위의 수를 더하면 얼마일까요?
		// int num = 1234567; => 1+2+3+4+5+6+7 => ?
		
		int num = 1234567;
		int sum = 0;
		//1234567 -> 123456 => 12345 => 1234 => 123 => 12 => 1
		
		while(num > 0) {
			System.out.println(num + " : " + sum);
			sum += num % 10;       
			num /= 10;
		}
		System.out.println(num + " : " + sum);

//	      int a = 0; // 백만
//	      int b = 0; // 십만
//	      int c = 0; // 만
//	      int d = 0; // 천
//	      int e = 0; // 백 
//	      int f = 0; // 십 
//	      int g = 0; // 일 
//	      
//	      a = num/1000000;       //1
//	      b = num%1000000/100000; //2
//	      c = num%100000/10000;    //3
//	      d = num%10000/1000;      //4
//	      e = num%1000/100;      //5
//	      f = num%100/10;         //6
//	      g = num%10;            //7
//	      
//	      System.out.println("a : " + a);
//	      System.out.println("b : " + b);
//	      System.out.println("c : " + c);
//	      System.out.println("d : " + d);
//	      System.out.println("e : " + e);
//	      System.out.println("f : " + f);
//	      System.out.println("g : " + g);
//	         
//	      System.out.println(a+b+c+d+e+f+g);
//	      
//	      //반복문과 조건문을 못 썼어요,,   

	}

}
