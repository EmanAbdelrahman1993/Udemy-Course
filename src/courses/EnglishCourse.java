package courses;

public class EnglishCourse {

	int students;
	int weeks;
	int days;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalDays;
		
		EnglishCourse Eng101 = new EnglishCourse();
		
		Eng101.students = 10;
		Eng101.weeks = 4;
		Eng101.days = 3;
		totalDays = Eng101.weeks * Eng101.days;
		
		System.out.println("English Course Eng101 is a total: " + totalDays + " Days");

	}
	

 

}
