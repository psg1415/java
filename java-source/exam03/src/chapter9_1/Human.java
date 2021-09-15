package chapter9_1;

public class Human extends Mammal {

	@Override
	void breads() { // Mammal
		System.out.println("Human Breads");
		
	}

	@Override
	void move() { // Animal 
		System.out.println(".");
	}
}