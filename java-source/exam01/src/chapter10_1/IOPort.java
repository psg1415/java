package chapter10_1;

public interface IOPort {
	String type = "DIV"; // �������̽� -> public static final�� ������ �ڵ����� �߰�
	public String portType(); //RGB, DVI, HTMI // abstract ���� ������ �ڵ� �߰�
}