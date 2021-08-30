package chapter10_5;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[]args) {
		System.out.println("��ȭ ��� ��� ��� ����");
		System.out.println("R - ������� ���");
		System.out.println("L - ª�� ��⿭ ã�� ���");
		System.out.println("P - �켱������ ���� ���");
		
		/*
		 * 1����Ʈ ���� 1��
		 * int -> ���� -1
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