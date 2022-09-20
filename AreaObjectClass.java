package siva;
import java.util.Scanner;
public class AreaObjectClass {
	float area,length,breadth,base,height,radius;
	float p=3.14f;
	Scanner sc=new Scanner(System.in);
	public void areaSquare() {
		System.out.println("enter  length of square");
        length=sc.nextFloat();
        area=length*length;
        System.out.println("Area of square ="+area);
}
	public void AreaRectangle() {
		System.out.println(" enter length of rectangle");  
        length=sc.nextFloat();
        System.out.println("enter breadth of rectangle");
        breadth=sc.nextFloat();
        area=length*breadth;
        System.out.println("Area of reactangle=" +area);
	}
public void AreaTriangle() {
	 System.out.println("enter base of triangle");  
     base=sc.nextFloat();
     System.out.println("enter height of triangle");
     height=sc.nextFloat();
     area=0.5f*base*height;
     System.out.println("Area of triangle=" +area);
}
public void AreaCircle() {
	System.out.println("enter radius of circle");    
    radius=sc.nextFloat();
    area=p*radius*radius;
    System.out.println("Area of circle= " +area);
}
public static void main( String args[] ) {
	int choice;
	AreaObjectClass aob=new AreaObjectClass();
	Scanner sc=new Scanner(System.in);
	System.out.println("***********MENU************");
	System.out.println("1.SQUARE");
	System.out.println("2.RECTANGLE");
	System.out.println("3.TRIANGLE");
	System.out.println("4.CIRCLE");
	System.out.println("\n Enter your choice\n");
	choice=sc.nextInt();
	switch(choice) {
	 case 1:  aob.areaSquare();
	              break;
	 case 2: aob.AreaRectangle();
	              break;
	 case 3: aob.AreaTriangle();
	              break;
	 case 4:aob.AreaCircle();
	              break;
		 	
}
}
}