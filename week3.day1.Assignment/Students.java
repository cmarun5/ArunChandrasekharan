package week3.day1.Assignment;

public class Students {
	public void getStudentInfo(int x, String name) {
		System.out.printf("Student ID & Student name :" +x +name);
	}
	public void getStudentInfo(String email, double phone) {
		System.out.printf("\nStudent mail & phone no.:"+email +phone);
	}
	
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(21, "Arun");
		info.getStudentInfo("cmarun5@gmail.com", 9791110077d);
		
	}

}
