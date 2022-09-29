/*is called encapsulation
 */
package encapsuation;

import java.util.Scanner;

class Employee{
	//instance variable :the variables declared in the class
	 int age; //int 0
	 String name;//String null
	 float salary; //0.0
	
	 void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter salary");
		salary=sc.nextFloat();
	}
	
	 void employeeDisplay() { //member function
		//int total salary; //local variable: the variable declared inside a method
		                  //local varibale does not have default values
		System.out.println("Name="+name);
		System.out.println("age="+age);
		System.out.println("salary="+salary);
		//System.out.println("total salary ="+totalsalary); compilation error
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		
		System.out.println("main method");
		Employee employeeobject1=new Employee(); //Object creation
		employeeobject1.inputData();
		employeeobject1.employeeDisplay();
		Employee employeeobject2=new Employee(); //Object creation
		employeeobject2.inputData();
		employeeobject2.employeeDisplay();
		
	}

}

