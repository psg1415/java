package chapter14_2;

public class ResourceEx1 implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("RescourceEx1 ´Ý±â...");
	}
}
