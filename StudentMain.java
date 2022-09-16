package encapsuation;

import java.util.Scanner;

class Student{
	String studentname;
	float studentfees;
	String studentemail;
	int tam,eng,maths,sci;
	float total, avg;
	
	void studentInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter studentname");
		studentname=sc.nextLine();
		System.out.println("Enter studentfees");
		studentfees=sc.nextFloat();
		System.out.println("Enter studentemail");
		studentemail=sc.next();
	}
	
	 void studentDisplay() { 
		System.out.println("studentName="+  studentname);
		System.out.println("studentfees="+studentfees);
		System.out.println("studentemail="+studentemail);
	}
	}

public class StudentMain {
	public static void main (String ars[]) {
		System.out.println("Mainmethod");
		Student studentobject=new Student ();
		studentobject.studentInput();
		studentobject.studentDisplay();
		
		
	}

}
