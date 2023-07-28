package studentManagementSystem;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses ="" ;
	private int tuitionBalance =0;
	private static int costOfCourse = 600;
	private static int id = 1001;
	
	public Student() {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = sc.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = sc.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = sc.nextInt();
		
		setStudentId();
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);
		                         
	}
	
	//Generate ID
	private void setStudentId() {
		// Grade Level + ID
		id++;
		this.studentId = gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		do {
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner sc=new Scanner(System.in);
		String course = sc.nextLine();
		if(!course.equals("Q")) {
			courses = courses + "\n " + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {
			//System.out.println("Break!");
			break;
		}
		}
		while(1!=0);
		//System.out.println("ENROLLED IN: "+courses);
		//System.out.println("TUITION BALANCE: "+ tuitionBalance);
	}
	//View balance
	public void viewBalance()
	{
		System.out.println("Your Balance is: " + tuitionBalance);
	}
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thanks You for your payment of Rs" + payment);
		viewBalance();
		}
		
	
	//show status
	public String showInfo() {
		return "Name: "+ firstName + " " + lastName +
				"\nGrade Level: " + gradeYear   +
				"\nStudent Id: " + studentId +
				"\nCourses Enrolled:" + courses +
				"\nBalance: Rs" + tuitionBalance;
	}
		
}
	 
		
		
		
		
	
	
	
	
