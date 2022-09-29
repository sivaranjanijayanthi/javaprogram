package encapsuation;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

	int num = 153;
	double sum = 0;
	int d;
	int temp = num;
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	num=sc.nextInt();
	while (num != 0) {
		d = num % 10;
		sum = sum + Math.pow(d, 3);
		num = num / 10;
		}
	if (sum == temp) {
		System.out.println(temp + " is armstrong number");

	} else {
		System.out.println(temp + " is not armstrong number");
	}
}

}
