package chapter15_1;

import java.io.IOException;

public class Ex3 {
	public static void main(String[]args) {
		
		int i;
		try {
			System.out.println("���ڸ� �Է��Ͻÿ� : ");
			while((i = System.in.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
