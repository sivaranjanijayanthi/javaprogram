package siva.com;

import java.util.Scanner;

public class DetailsEmp {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int age;
		float salary;
		String ename;
		int id;
		System.out.println("Enter the name");
		ename=sc.next();
		System.out.println("enter age ");
		age=sc.nextInt();
		System.out.println("enter salary");
	    salary=sc.nextFloat();
	    System.out.println(" enter id");
	    id=sc.nextInt();
	    System.out.println("enter the name" + ename);
	    System.out.println(" enter the age" + age);
		System.out.println("enter salary" + salary);
      System.out.println("enter the id" + id);
	}

}
