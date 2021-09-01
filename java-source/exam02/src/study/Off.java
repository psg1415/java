package study;

public class Off implements FanPower {

	@Override
	public void powerOn() {
		System.out.println("");
	}

	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
