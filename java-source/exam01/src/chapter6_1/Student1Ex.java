package chapter6_1;

public class Student1Ex {
	static int serialNum;
	int studentID;
	int studentCard;
	
	public Student1Ex() { 
		studentID = ++serialNum;
	}
	
	public int getSerialNum() {
		return serialNum;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public int getStudentCard() {
		return studentID + 100;
	}

}
