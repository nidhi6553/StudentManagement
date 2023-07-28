package studentManagementSystem;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		
		
		//ASK NUMBER OF NEW STUDENTS
		System.out.print("Enter number of new students to enroll: ");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		Student[] students = new Student[num];
		for(int i=0;i<num;i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			
		}
		for(int i=0;i<num;i++) {
			System.out.println(students[i].showInfo());
		}
	}

}

