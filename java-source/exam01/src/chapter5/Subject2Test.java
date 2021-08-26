package chapter5;

public class Subject2Test {
	public static void main(String[]args) {
		Student2 student = new Student2(1001, 40, "이름");
		student.addsubject("국어", 90);
		student.addsubject("수학", 80);
		
		student.showInfo();
	}
}
