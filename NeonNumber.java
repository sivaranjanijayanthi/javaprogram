package encapsuation;
import java.util.Scanner;
public class NeonNumber {
	public static void main(String[] args) {
		int sum=0,num;
		int d;
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter to number check");
		num=sc.nextInt();
		int square=num*num;
		while(square!=0) {
			d=square%10;
			sum=sum+d;
			square=square/10;
		}
		if(num==sum) {
			System.out.println(num + "is a neon number");
		}
		else {
			System.out.println(num + "is not a neon number");
		}
		
	}

}
