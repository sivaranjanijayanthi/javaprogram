package encapsuation;

import java.util.Scanner;
class Factorial{
	int i,fact=1;
	int n;
void input() {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    n=sc.nextInt();
}
void calculate() {
	 for(i=1;i<=n;i++) {
     	fact=fact*i;	
     }
}	
void display() {
	System.out.println("Factorial of" +n+ "is = " +fact);
}
}
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj=new Factorial();
		obj.input();
		obj.calculate();
		obj.display();
		
	}
}
		
		
       
