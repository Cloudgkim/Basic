package basic.basic;

public class basic14 {

	public static void main(String[] args) {
		// while문으로 구구단을 만드시오.
		int x = 2;
		while(x <= 9) {
			int y = 1;
			while(y <= 9) {
				System.out.println(x + "X" + y + "=" + (x*y) + "\t");
				y++;
			}
			System.out.println();
			x++;
		}

	}

}
