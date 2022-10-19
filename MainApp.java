package com.edubri;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10,b=0,c=0;
System.out.println("Before Division");
try {
	c=a/b;
}
catch(ArithmeticException e){
	System.out.println(e);
}
System.out.println("c =" +c);
System.out.println("Before Division");
	}

}
