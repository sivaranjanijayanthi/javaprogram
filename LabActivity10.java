package siva.Lab;

import java.util.Scanner;

public class LabActivity10 {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter choice");
		a=sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("i am @home");
			break;
		case 2:
			System.out.println(" i am @office");
			break;
		case 3:
			System.out.println(" i am @school");
			break;
			default:
				System.out.println("not in @home,@office,@school");
		}

	}

}
