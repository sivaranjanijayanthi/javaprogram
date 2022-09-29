package encapsuation;

import java.util.Scanner;

public class ArrayofObj {
	// public class EmpDetails{
		int eid;
		String ename;
		static String cname="Capgemini";
	
	void inputEmp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id ");
		eid=sc.nextInt();
		System.out.println("Enter name");
		ename=sc.next();
	}
void display() {
	System.out.println("eid= " +eid);
	System.out.println("ename= " +ename);
	System.out.println("cname =" +cname);
}
	public static void main(String[] args) {
		ArrayofObj emp []=new ArrayofObj[5];
		for(int i=0;i<emp.length;i++) {
			emp[i]=new ArrayofObj();
			emp[i].inputEmp();	
		}
		System.out.println("Employee record are");
		for(int i=0;i<emp.length;i++) {
			emp[i].display();
		}
	}

}
