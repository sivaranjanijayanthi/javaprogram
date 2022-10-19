package com.edubri;

import java.util.Scanner;

public class DivideByzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
a=sc.nextInt();
System.out.println("Enter b value");
b=sc.nextInt();
try {
	c=a/b;
}catch (ArithmeticException  e){
	System.out.println(e);
	
}finally {
	System.out.println("finally excute");
}
System.out.println("c= " +c);
System.out.println("After division");
	}

}
