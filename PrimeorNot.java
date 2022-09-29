package encapsuation;

import java.util.Scanner;

class Prime{
	int num,factcount=0,i;
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
	}
	void calculate() {
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(  );
				factcount++;
				
			}
		}
		if(factcount==2) {
			System.out.println(num+" is a prime number");
			
		}else {
			System.out.println( num+ "not a prime number "  );
		}

	}
}
public class PrimeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Prime ob=new Prime();
ob.input();
ob.calculate();
	}

}
