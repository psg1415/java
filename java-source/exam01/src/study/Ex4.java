package study;

public class Ex4 {
	public static void main(String[]args) {
		int a;
		int b;
		for(a = 1; a <= 9; a++) {
			for(b = 1; b <= 9; b++) {
				if(b >= a) {
					System.out.println(a + "X" + b + "=" + (a*b));
				}
			}
			
		}
	}
}
