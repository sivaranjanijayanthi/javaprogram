package siva;

import java.util.Scanner;

public class SwitchCaseArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		float num1,num2,res;
System.out.println("***********MENU************");
System.out.println("1.ADDITION");
System.out.println("2.SUBTRACTION");
System.out.println("3.MULTIPLIACTION");
System.out.println("4.DIVISION");
System.out.println("\n Enter your choice\n");
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();
System.out.println("Enter two numbers");
num1=sc.nextFloat();
num2=sc.nextFloat();
switch(ch) {
        case 1: res=num1+num2;
        System.out.println("sum=" +res);
        break;
        case 2: res=num1-num2;
        System.out.println("difference" +res);
        break;
        case 3: res=num1*num2;
        System.out.println("Product=" +res);
        break;
        case 4: res=num1/num2;
        System.out.println("Division" +res);
        break;
        default:System.out.println("Invalid choice");
        

}

	}

}