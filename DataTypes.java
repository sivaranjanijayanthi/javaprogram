package scanner;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		Scanner sc=new Scanner  (System.in);
		int i;
		byte b;
		short s;
		String  fname;
		char ch;
		float f;
		double d;
		System.out.println("enter name :");
		fname=sc.next();
		System.out.println("enter integer value");
		i=sc.nextInt();
		System.out.println("enter  byte value");
		b=sc.nextByte();
		System.out.println("enter float value");
		 f=sc.nextFloat();
		 System.out.println("enter  shortint value");
		 s=sc.nextShort();
		 System.out.println("enter char value");
		 ch=sc.next().charAt(0);
		 System.out.println("enter double value");
		 d=sc.nextDouble();
		 System.out.println("name=" + fname);
		 System.out.println("Integer value=" +i);
		 System.out.println("float value= " + f);
		 System.out.println("double value =" +d);
		 System.out.println("short int value= " + s);
		 System.out.println("char value =" + ch);
		 
		 
		
		 
		 
	}		
		

}

