package chapter14_1;

public class Ex2 {
	public static void main(String[] args) {
		try {
			int num1 = 10;
			int num2 = 0;
			System.out.println(num1 / num2);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage()); //Throwable 클래스에 정의가 많이 되어 있다
		} 
		
		
		System.out.println("실행 되나요?");
	}
}
