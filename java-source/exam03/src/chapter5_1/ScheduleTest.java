package chapter5_1;

public class ScheduleTest {
	public static void main(String[]args) {
		Schedule s1 = new Schedule();
		/*
		s1.year = 2021;
		s1.month = 9;
		s1.day = 13;
		s1.showInfo();
		*/
		/*
		s1.year=2121;
		s1.month=2;
		s1.day=31;
		s1.showInfo();
		*/
		
		s1.setYear(2021);
		s1.setMonth(2);
		s1.setDay(31);
		
		System.out.println(year);
		
		s1.showInfo();
	}
}
