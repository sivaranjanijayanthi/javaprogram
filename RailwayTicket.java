package encapsulation;

import java.util.Scanner;

public class RailwayTicket {

	//private static final String First_Ac = null;
	String name;
	String coach;
	long mobno;
	int amt,totalamt;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter mobno");
		mobno=sc.nextLong();
		System.out.println("Enter amt");
		amt=sc.nextInt();
		System.out.println("Enter coach");
		coach=sc.next();
	}
	void update() {
		switch(coach) {
		case "First_Ac": totalamt= amt+700;
		break;
		case "Second_Ac": totalamt= amt+500;
		break;
		case "Third_Ac":totalamt= amt+250;
		break;
		case "Sleeper" :  totalamt  = amt;
		break;
		}
	}
	void display() {
		System.out.println("customer name= " +name);
		System.out.println("coach=" +coach);
		System.out.println(" Total amount=" +totalamt);
		System.out.println("Mobile number = " +mobno);
	}
	public static void main(String[] args) {
		RailwayTicket obj=new RailwayTicket();
		obj.accept();
		obj.update();
		obj.display();

	}

}
