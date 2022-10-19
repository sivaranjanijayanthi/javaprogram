package com.edubri;

import java.util.Scanner;

public class CheckMovie {
  public static void checkAge(int age) {
	  try {
		  if(age<=18) {
			  throw new ArithmeticException("Not eligible for vote")  ;
		  }else {
			  System.out.println("you are eligible voting");
		  }
	  }catch(ArithmeticException e) {
		  e.printStackTrace();
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int page;
Scanner sc=new Scanner(System.in);
System.out.println("enter age");
page=sc.nextInt();
checkAge(page);
	}

}
