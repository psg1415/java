package chapter13_1;

public class Ex1 {
	public static void main(String[] args) {
		//OuterClass.staticMethod();
		OuterClass out = new OuterClass();
		OuterClass.InnerClass inner = out.new InnerClass();
		inner.innerMethod();
		inner.innerStaticMethod();
		OuterClass.InnerClass.innerStaticMethod(); //16���� ���ĺ��� ����
	}
}
