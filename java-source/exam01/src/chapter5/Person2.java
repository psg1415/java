package chapter5;

public class Person2 {
	String name;
	double height;
	double weight;
	
	public Person2(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("�̸� = " + name);
		System.out.println("Ű = " + height);
		System.out.println("������ = " + weight);
	}
}
