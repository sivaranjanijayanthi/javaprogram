package siva;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		float area,length,breadth,base,height,radius;
		float p=3.14f;
		System.out.println("***********MENU************");
		System.out.println("1.SQUARE");
		System.out.println("2.RECTANGLE");
		System.out.println("3.TRIANGLE");
		System.out.println("4.CIRCLE");
		System.out.println("\n Enter your choice\n");
		Scanner sc=new Scanner(System.in);
		 choice=sc.nextInt();
		 switch(choice) {
		 case 1: System.out.println("enter  length of square");
		            length=sc.nextFloat();
		            area=length*length;
		            System.out.println("Area of square ="+area);
		            break;
		 case 2: System.out.println(" enter length of rectangle");  
		              length=sc.nextFloat();
		              System.out.println("enter breadth of rectangle");
		              breadth=sc.nextFloat();
		              area=length*breadth;
		              System.out.println("Area of reactangle=" +area);
		              break;
		 case 3: System.out.println("enter base of triangle");  
		              base=sc.nextFloat();
		              System.out.println("enter height of triangle");
		              height=sc.nextFloat();
		              area=0.5f*base*height;
		              System.out.println("Area of triangle=" +area);
		              break;
		 case 4:System.out.println("enter radius of circle");    
		             radius=sc.nextFloat();
		             area=p*radius*radius;
		             System.out.println("Area of circle= " +area);
		             break;
		    default: System.out.println("Invalid choice");
		 }
	}

}
