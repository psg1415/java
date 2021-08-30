package chapter10_5;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[]args) {
		System.out.println("전화 상담 배분 방식 선택");
		System.out.println("R - 순서대로 배분");
		System.out.println("L - 짧은 대기열 찾아 배분");
		System.out.println("P - 우선순위에 따라서 배분");
		
		/*
		 * 1바이트 문자 1개
		 * int -> 엔터 -1
		 */
		int ch = System.in.read(); 
		Scheduler scheduler = null;
		if(ch == 'R') {
			RoundRobin scheduler = new RoundRobin();
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}else if(ch =='L') {
			LeastJob scheduler = new LeastJob();
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}else if(ch =='P') {
			PriorityAllocation scheduler = new PriorityAllocation();
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}
	}
}
