package encapsulation;
import java.util.Scanner;
public class Showroom {
 String cname;
 long mobno;
 double cost;
 double amount;
 void input() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter cutomer name");
	 cname=sc.next();
	 System.out.println("Enter mobile num");
	 mobno=sc.nextLong();
	 System.out.println("Enter  cost");
	 cost=sc.nextDouble();
 }
 void calculate() {
	 double discount=0.0;
	 if(cost<=10000) {
		System.out.println (discount= 5) ;
	 } else if(cost<=20000) {
		 System.out.println(discount= 10);
	 }else if(cost<=350000)
	 {
		 System.out.println(discount= 15);
	 }
	 else
	 {
		 System.out.println(discount=20);
	 }
	 discount=cost*discount/100.0;
	 amount=cost-discount;
	 
 }
 void display() {
	 System.out.println("customer name =" +cname);
	 System.out.println("mobile number =" +mobno);
	 System.out.println("Amount to be paid after discount ="+amount);
	 
 }
 
	public static void main(String[] args) {
		Showroom obj= new Showroom();
		obj.input();
		obj.calculate();
		obj.display();

	}
}
 