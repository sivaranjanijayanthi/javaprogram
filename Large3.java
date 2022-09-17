package sivas;
import java.util.Scanner;
public class Large3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=(a>b&& a>c)?a:(b>a&& b>c)?b:c;
		System.out.println("the lrgest of num " +a+  +b+    +c+  ",is"  +d);
		

	}

}
