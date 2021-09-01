package study;

import java.io.IOException;

public class FanTest  {

	public static void main(String[]args) throws IOException {
		System.out.println("선풍기 전원을 끄거나 킵니다");
		System.out.println("Y : 전원키기");
		System.out.println("1 : 1단");
		System.out.println("2 : 2단");
		System.out.println("3 : 3단");
		System.out.println("N : 전원끄기");
		
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
