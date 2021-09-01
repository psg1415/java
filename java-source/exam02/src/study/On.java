package study;

public class On implements FanPower {

	@Override
	public void powerOn() {
		System.out.println("전원을 킵니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("");
	}

}
