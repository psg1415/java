package chapter8;

public class B extends A{
	int numB = 20;
	
	B(){
		//super(); //AŬ������ �⺻ ������
		System.out.println("B ������");
	}
	
	void methodB() {
		System.out.println("methodB");
	}
}
