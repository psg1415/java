package chapter10_2;

public interface Sell {
	void sell(); //public abstract
	
	default void order() {
		System.out.println("Sell - Sell¸Þ¼­µå");
	}
}
