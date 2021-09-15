package chapter6_1;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student(1001, "1");
		s1.showInfo();
		
		Student s2 = new Student();
		s2.showInfo();
		
		s2.setStudentID(1002).setName("2").showInfo(); 
	}
}