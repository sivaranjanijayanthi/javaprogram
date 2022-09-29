package encapsuation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Fibonacci{
	int m1,m2,m3,term;
	Fibonacci(){
		m1=0;
		m2=1;
	}
void inputData() throws IOException {
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of terms");
	term=Integer.parseInt(br.readLine());
	
}
void generatesFibonacci() {
	System.out.println("Fibonacci series");
	System.out.println(m1);
	System.out.println(m2);
	for(int  i=1;i<=term-2;i++) {
		 m3=m1+m2;
		 System.out.println(m3);
		 m1=m2;
		 m2=m3;
	 }
}
}	
public class FibonacciSeries {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Fibonacci ob=new Fibonacci();
		ob.inputData();
		ob.generatesFibonacci();
		
	}
	}


