package sivajaya;

import java.util.Scanner;

public class Largest0f2IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+ "is larger than" +b);
		}
		else
		{
			System.out.println(b+ "is larger than" +a);
		}

	}

}
