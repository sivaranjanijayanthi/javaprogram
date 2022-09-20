package siva;

import java.util.Scanner;

public class OddEvenUseSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
  switch(num % 2) {
  case 0:
	 System.out.println("Even numvber");
	 break;
  case 1:
	  System.out.println( " Odd number");
	  break;
  }
	}
}
	  
  
	



