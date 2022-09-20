package siva;
import java.util.Scanner;
public class SwitchCaseMainDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number  1 to 5");
num=sc.nextInt();
switch(num) {
           case 1: System.out.println("one");
                     break;
           case 2: System.out.println("two");
           break;
           case 3: System.out.println("Three");
           break;
           case 4: System.out.println("four");
           break;
           case 5: System.out.println("five");
           break;
           default:System.out.println("Invalid num");
}
	}

}
