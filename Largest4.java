package sivas;
import java.util.Scanner;
public class Largest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,large;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the four numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		large=(a>b && a>c)?a:(b>a && b>c)?b:(c>d && a>d)?c:d;
		System.out.println("the lrgest of num ="  +large);
		


	}

}
