package study;

import java.io.IOException;

public class FanTest  {

	public static void main(String[]args) throws IOException {
		System.out.println("��ǳ�� ������ ���ų� ŵ�ϴ�");
		System.out.println("Y : ����Ű��");
		System.out.println("1 : 1��");
		System.out.println("2 : 2��");
		System.out.println("3 : 3��");
		System.out.println("N : ��������");
		
		int p = System.in.read();
		Fan fan = null;
		FanPower fanPower = null;
		
		if(p == 'Y') {
			fanPower = new On();
		} else if (p == '1') {
			fan = new One();
		} else if (p == '2') {
			fan = new Two();
		} else if (p == '3') {
			fan = new Three();
		} else if (p == 'N') {
			fanPower = new Off();
		} else {
			return;
		}
	}
}
