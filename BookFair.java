package encapsulation;

import java.util.Scanner;

public class BookFair {
	String Bname;
	double price;
	void input() {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter name of the book");
		 Bname=sc.nextLine();
		 System.out.println("Enter the price of the book");
		 price=sc.nextDouble();
	}
	void calculate() {
		double discount;
		if(price<=100) {
			discount=price*0.02;
		}else if(price<=300) {
			discount=price*0.1;
		}else {
			discount=price*0.15;
			price -=discount;
		}
	}
	void display() {
		System.out.println("Book Name :"   +Bname);
		System.out.println("price after discount: " +price);
	}

	public static void main(String[] args) {
		BookFair obj=new BookFair();
		obj.input();
		obj.calculate();
		obj.display();

	}

}
