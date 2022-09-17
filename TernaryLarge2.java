package sivas;
import java.util.Scanner;
public class TernaryLarge2 {
	public static void main (String[] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=(a>b)?a:b;
	System.out.println("print large num=" +c);


	}

}
