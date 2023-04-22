
/*Assignment:5
=========
Create Class Student
declare variables
studentName
rollNo
collegeName
markScored
cgpa

Create a class Report and create object for student class in main method and print all the variables
 * 
 */
package week1.day1;
public class Student {
	private void studentName() {
		String studentName = "Arun";
		System.out.println("Student Name ="+studentName);	
	}
	private void rollNo() {
		int rollNo = 12345;
		System.out.println("Roll No.=" +rollNo );
	}
	private void collegeName() {
		String collegeName ="Hindustan University";
		System.out.println("College Name =" +collegeName);
		
	}
	private void markScored(int a, int b, int c ,int d , int e , int f, int h) {
		System.out.println("Marks Scored");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(h);
	}
	private void cgpa() {
		int cgpa = 8;
		System.out.print("CGPA  = "+cgpa);
		
	}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentName();
		obj.rollNo();
		obj.collegeName();
		obj.markScored(80, 81, 82, 83, 84, 85, 86);
		obj.cgpa();
		
		
		
	}
	
	}
		




