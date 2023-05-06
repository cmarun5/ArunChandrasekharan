package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name : Arun Chandrasekharan");
	}
	public void studentDept() {
		System.out.println("Student Dept: Avionics");
	}
	public void studentId() {
		System.out.println("Student Id : 0021");
	}
	public static void main(String[] args) {
		Student details = new Student();
		details.studentName();
		details.studentId();
		details.studentDept();
		details.deptName();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();

	}
}
