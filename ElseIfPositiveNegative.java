package sivajaya;
import java.util.Scanner;

public class   ElseIfPositiveNegative{
	int num;
	void InputData() {
	Scanner sc=new Scanner(System.in);
	System.out.println ("enter the number");
	num=sc.nextInt();
	}
	void checkNum(){
		if(num>0)
		{
			System.out.println(num +"Number is positive");
		}
		else {
			System.out.println(num +"Number is negative");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElseIfPositiveNegative ob=new ElseIfPositiveNegative();
		ob.InputData();
		ob.checkNum();
		

	}

}


