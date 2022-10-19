package com.edubri;

import java.util.Scanner;

public class ThrowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,b,c=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a value");
     a=sc.nextInt();
     System.out.println("enter b value");
     b=sc.nextInt();
     try {
    	 if(b==0) {
    		 throw new ArithmeticException("Divide By Zero");
    	 }
    	 else {
    		 c=a/b;
    		 System.out.println(" c = " +c);
    	 }
     }
     catch(ArithmeticException e){
    	 e.printStackTrace();
    	 
     }
	}

}
