package siva.Lab;

public class LabExercise5 {

	public static void main(String[] args) {
		//Assignment operator
		int number1,number2;
		number1=10;
		System.out.println(number1);
		number2=number1;
		System.out.println(number2);
		//Arithmetic Operator
		double output;
		//Addition operator
		output=number1+number2;
		System.out.println("number1 + number2 =" +output);
		//Subtraction operator
		output=number1-number2;
		System.out.println("number1 - number2=" +output);
		//multiplication operator
		output=number1*number2;
		System.out.println("number1 *number2 =" +output);
		//division operator
		output=number1/number2;
		System.out.println("number1/number2=" +output);
		//remainder operator
		output=number1%number2;
		System.out.println("number1%number2 ="+output);
		//Unary operator
		double number=10;
		boolean flag=false;
		System.out.println("+number = " + +number);
		//number is =10.
		System.out.println(" -number=" +-number);
		System.out.println(" number ="  + ++number);
		System.out.println(" number = " +--number);
		System.out.println("!flag =" +!flag);
		System.out.println(number++);
		System.out.println(number);
		System.out.println(++number);
		System.out.println(number);
		//Relational Operator
		if(number1>number2)
		{
			System.out.println("number1 is greater than number2");
		}
		
if(number1 < number2) {
	System.out.println("number1 is greater than number1");
}
if(number1==number2) {
	System.out.println("number1 is equal to number2");
}
//Logical operators
int number3=20;
//OR operators
boolean result;
result=(number1>number2)|| (number3 > number1);
System.out.println(result);
//AND operator
result=(number1>number2)&&(number3 > number1);
System.out.println(result);
//Ternary operator
int februaryDays=29;
String display;
display=(februaryDays==28) ? "Not a leap year" : "Leap Year";
System.out.println(display);
//Bitwise operator
 int a=50;
 int b=20;
 int c=0;
 c= a&b;
 System.out.println(" a&b =" +c);
 c=a|b;
 System.out.println("a|b=" +c);

	}

}
