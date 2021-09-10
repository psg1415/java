package chapter15_6;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex3 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("a.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos)){
			osw.write("���ݱ��� �ڹ� ���� ����ְ� �����߾��^^");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
