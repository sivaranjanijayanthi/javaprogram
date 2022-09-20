package siva;

import java.util.Scanner;

public class SwitchStringMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month");
		month=sc.next();
		switch(month) {
		case "January": System.out.println("First month of the year");
		                           break;
		case "February":System.out.println("Second month of the year");
		                           break;
		case "March":System.out.println("Third month of the year");
		                           break;
		case "April":System.out.println("Fourth month of the year");
                                  break;
		case "May":System.out.println("Fifth month of the year");
                                  break;
		case "June":System.out.println("Sixth month of the year");
                                  break;
		case "July":System.out.println("Seventh month of the year");
                                  break;
		case "August":System.out.println("Eighth month of the year");
                                  break;
		case "September":System.out.println("Nineth month of the year");
                                   break;
		case "October":System.out.println("Tenth month of the year");
                                   break;
		case"November":System.out.println("Eleventh month of the year");
                                    break;
		case "December":System.out.println("Twelth month of the year");
                                    break;
        default:System.out.println("Invalid month");                          
		}	
	}
}
