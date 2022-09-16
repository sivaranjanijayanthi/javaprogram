package listmark;

import java.util.Scanner;


public class StudentMark {
	int tam,eng,maths,sci;
	float total, avg;

void InputMark() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the marks: tamil,english,matjs,science\n:");
	tam=sc.nextInt();
	eng=sc.nextInt();
	maths=sc.nextInt();
	sci=sc.nextInt();
	
}
void calculateTotalAverageMarks() {
	total=tam+eng+maths+sci;
	avg=total/4;
	System.out.println("Total=" +total);
	System.out.println("Avg=" +avg);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mainmethod");
	    StudentMark studentobject=new StudentMark ();
		studentobject.InputMark();
		studentobject.calculateTotalAverageMarks();
		
		

	}

}
