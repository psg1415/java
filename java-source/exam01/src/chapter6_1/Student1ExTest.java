package chapter6_1;

public class Student1ExTest {
	public static void main(String[]args) {
		Student1Ex st1 = new Student1Ex(); 
		Student1Ex st2 = new Student1Ex(); 
		Student1Ex st3 = new Student1Ex(); 
		System.out.println("st1 학번 = " + st1.getStudentID() + ", 학생카드 = " + st1.getStudentCard());
		System.out.println("st2 학번 = " + st2.getStudentID() + ", 학생카드 = " + st2.getStudentCard());
		System.out.println("st3 학번 = " + st3.getStudentID() + ", 학생카드 = " + st3.getStudentCard());
		
	}
}
