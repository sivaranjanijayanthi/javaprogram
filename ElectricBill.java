package encapsulation;

import java.util.Scanner;

public class ElectricBill {
 String n;
 int units;
 double bill;
 void accept() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter name of the customer");
	 n=sc.next();
	 System.out.println("number of units power consumed");
	 units=sc.nextInt();
 }
 void calculate() {
	 if(units<=100) {
		 bill= units *2;
	 } else if(units<=300) {
		 bill=200+(units-100)*3;
		 
	 }else {
		 double amt= 200+600+(units-300)*5;
		 double surcharge=(amt*2.5)/100;
		 bill=amt+surcharge;
		 
	 }
 }
 void display() {
	 System.out.println("Name of the customer       :  "  +n);
	 System.out.println("Number of units consumed      :  " +units);
	 System.out.println("Bill amount :    "    +bill);
 }
	public static void main(String[] args) {
		ElectricBill obj=new ElectricBill();
		obj.accept();
		obj.calculate();
		obj.display();

	}

}
