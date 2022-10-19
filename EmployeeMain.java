package comedu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

class EmployeeD{
	int eid;
	String ename;
	int eage;
	float esalary;
	
public EmployeeD() {
		super();
		
	}

	void inputEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Details");
		System.out.println("Enter name");
		ename=sc.next();
		System.out.println("Enter Employee id");
		eid=sc.nextInt();
		System.out.println("Enter employee age");
		eage=sc.nextInt();
		System.out.println("Enter Employee salary");
		esalary=sc.nextFloat();
	}
}
//
class SortEmpSalary implements Comparator<EmployeeD>{//Comparable java.lang

	@Override
	public int compare(EmployeeD e1, EmployeeD e2) {
		if(e1.esalary==e2.esalary)
		     return 0;
		else if(e1.esalary<e2.esalary)
			return -1;
		else 
			return 1;
					
	}
}
class SortEmpAge implements Comparator<EmployeeD>{

	@Override
	public int compare(EmployeeD e1, EmployeeD e2) {
		if(e1.eage==e2.eage)
		     return 0;
		else if(e1.eage<e2.eage)
			return -1;
		else 
			return 1;
					
	}
	
}

class SortEmpID implements Comparator<EmployeeD>{

	@Override
	public int compare(EmployeeD e1, EmployeeD e2) {
		if(e1.eid==e2.eid)
		     return 0;
		else if(e1.eid<e2.eid)
			return -1;
		else 
			return 1;
					
	}
	
}

class SortEmpName implements Comparator<EmployeeD>{

	@Override
	public int compare(EmployeeD emp1, EmployeeD emp2) {
		return emp1.ename.compareToIgnoreCase(emp2.ename);
	}
	
}
public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeD e1=new EmployeeD();
		EmployeeD e2=new EmployeeD();
		EmployeeD e3=new EmployeeD();
		EmployeeD e4=new EmployeeD();
		
		e1.inputEmployee();
		e2.inputEmployee();
		e3.inputEmployee();
		e4.inputEmployee();
		
		ArrayList<EmployeeD>lemp=new ArrayList<EmployeeD>();//LinkedList or Vector
		lemp.add(e1);
		lemp.add(e2);
		lemp.add(e3);
		lemp.add(e4);
		
		//Display Employee
		Iterator<EmployeeD> eit=lemp.iterator();
		
		System.out.println("Employee Details");
		System.out.println("___________________________________________________");
		System.out.println("ID\tName\tAge\tSalary");
		while(eit.hasNext()) {
			EmployeeD empobj=eit.next();
			System.out.println(empobj.eid+"\t"+empobj.ename+"\t"+empobj.eage+"\t"+empobj.esalary);
		}
		
		//Sort Employee data
		//SortEmpSalary esort=new SortEmpSalary();
		//Collections.sort(lemp,esort);
		Collections.sort(lemp,new SortEmpSalary() );
		System.out.println("After Sorting Employee Based on Salary");
		//Display Employee
				Iterator<EmployeeD> eit1=lemp.iterator();
				
				System.out.println("Employee Detail");
				System.out.println("___________________________________________________");
				System.out.println("ID\tName\tAge\tSalary");
				while(eit1.hasNext()) {
					EmployeeD empobj1=eit1.next();
					System.out.println(empobj1.eid+"\t"+empobj1.ename+"\t"+empobj1.eage+"\t"+empobj1.esalary);
				}
				
				
				//Based on age sorting
				Collections.sort(lemp,new SortEmpAge());
				System.out.println("___________________________");
				System.out.println("After Sorting Employee Based on Age");
				//Display Employee
						Iterator<EmployeeD> eit2=lemp.iterator();
						
						System.out.println("Employee Detail");
						System.out.println("___________________________________________________");
						System.out.println("ID\tName\tAge\tSalary");
						while(eit2.hasNext()) {
							EmployeeD empobj1=eit2.next();
							System.out.println(empobj1.eid+"\t"+empobj1.ename+"\t"+empobj1.eage+"\t"+empobj1.esalary);
						}
						
						
						//Based on ID sorting
						Collections.sort(lemp,new SortEmpID());
						System.out.println("___________________________");
						System.out.println("After Sorting Employee Based on ID");
						//Display Employee
								Iterator<EmployeeD> eit3=lemp.iterator();
								
								System.out.println("Employee Detail");
								System.out.println("___________________________________________________");
								System.out.println("ID\tName\tAge\tSalary");
								while(eit3.hasNext()) {
									EmployeeD empobj1=eit3.next();
									System.out.println(empobj1.eid+"\t"+empobj1.ename+"\t"+empobj1.eage+"\t"+empobj1.esalary);
								}
								

								//Based on Name sorting
								Collections.sort(lemp,new SortEmpName());
								System.out.println("___________________________");
								System.out.println("After Sorting Employee Based on Name");
								//Display Employee
										Iterator<EmployeeD> eit4=lemp.iterator();
										
										System.out.println("Employee Detail");
										System.out.println("___________________________________________________");
										System.out.println("ID\tName\tAge\tSalary");
										while(eit4.hasNext()) {
											EmployeeD empobj1=eit4.next();
											System.out.println(empobj1.eid+"\t"+empobj1.ename+"\t"+empobj1.eage+"\t"+empobj1.esalary);
					}
										
						 				
				
	}
}

