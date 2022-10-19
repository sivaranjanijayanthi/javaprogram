package comedu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Employee{
	int eid;
	String ename;
	int eage;
	//String edname;
	float salary;
	public Employee() {
		super();
	} 
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Details");
		System.out.println("Enter employee name");
		ename=sc.next();
		System.out.println("Enter EmpId");
		eid=sc.nextInt();
		System.out.println("Enter employee age");
		eage=sc.nextInt();
		System.out.println("Enter  employee salary");
		salary=sc.nextFloat();
	}
	}
public class ArrayListUserDefinedUserIp {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		//Employee e3=new Employee();
		e1.inputData();
		e2.inputData();
		//e3.inputData();
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		//emp.add(e3);
		Iterator<Employee> eit=emp.iterator();
		System.out.println("Empoyee Details");
		System.out.println("**************************************************");
		System.out.println("ID NAME AGE SALARY");
		while(eit.hasNext()) {
			Employee empobj =eit.next();
			System.out.println(empobj.eid +"\t" +empobj.ename+"\t"    +empobj.eage +"\t"    +empobj.salary +"\t");
		}
		
	}

}
