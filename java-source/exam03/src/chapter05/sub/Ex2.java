package chapter05.sub;

import chapter05.Ex1;

public class Ex2 extends Ex1{
	void prith() {
		System.out.println(this.num4);
	}
	
	@Override
	public void protectedMethod() {
		super.protectedMethod();
	}
}
