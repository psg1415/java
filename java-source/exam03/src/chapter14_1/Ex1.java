package chapter14_1;

import java.io.*;

public class Ex1 {	
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			//���ҽ� ���� -> �ݾ�
			
			
		}catch(IOException e) {
			//���� ó�� ����, �α�
		
		} finally {
			try {
				fis.close();
			}catch (Exception e) {
				
			}
		}
		
		System.out.println("���� �ǳ���?");
	}
}
