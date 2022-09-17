package sivajaya;

import java.util.Scanner;

public class IfelseUseOddEven {
	int num;
	void Input() {
	Scanner sc=new Scanner(System.in);
	System.out.println ("enter the number");
	num=sc.nextInt();
	}
	void checkEvenOdd(){
		if(num%2==0)
		{
			System.out.println(num +"Odd num");
		}
		else {
			System.out.println(num +"even num");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfelseUseOddEven ob=new IfelseUseOddEven();
		ob.Input();
		ob.checkEvenOdd();
		

	}

}
