package chapter9_1;

public class Bus extends Car {
	void run() {
		System.out.println("버스가 달립니다.");
	}

	void refuel() {
		System.out.println("천연 가스를 충전 합니다.");
	}

	void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	void takePassenger() {
		System.out.println("승객을 버스에 테웁니다.");
	}
}
