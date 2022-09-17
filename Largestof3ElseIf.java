package sivajaya;

import java.util.Scanner;

public class Largestof3ElseIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fnum,snum,tnum;
		Scanner sc=new Scanner(System.in);
		System.out.println ("enter first numbers");
		fnum=sc.nextInt();
		System.out.println("enter second num");
		snum=sc.nextInt();
		System.out.println("enter thrd num");
		tnum=sc.nextInt();

		if(fnum>snum && fnum>tnum) {
			System.out.println("largest of  "+fnum+" , "+snum+" and "+tnum+" is"+fnum);
		}

		else if(snum>fnum && snum>tnum) {
			System.out.println("largest of"+fnum+","+snum+"and"+tnum+" is"+snum);	
		}
		else {
			System.out.println("largest of"+fnum+" ,"+snum+"and"+tnum+" is"+tnum);
		}
	}
			
}