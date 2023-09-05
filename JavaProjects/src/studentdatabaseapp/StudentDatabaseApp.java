package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.toString());
		// Ask how many new users we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents-1];
		// Create a number of new students
		for(int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			Student stu = new Student();
			stu.enroll();
			stu.payTuition();
			System.out.println(stu.toString());
		}
	}
}
