package study;

public class Ex2 {	
	public static void main(String[]args) {
		int a;
		for(a = 1; a <= 40; a++) {
			int b = a % 10;
			
			System.out.println("학생" + a + ", 방번호 " + b + "번");
			
		}
	}
}
