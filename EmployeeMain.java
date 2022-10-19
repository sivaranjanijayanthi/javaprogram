package com.edubri;
class EmployeeException extends Exception{
	public EmployeeException(String s) {
		super(s);
	}
}
class Employee{
	public void checkId(int id) {
		try {
			if(id<=0 || id>=999){
				throw new EmployeeException("Invalid employee id");
			}else {
				System.out.println("emloyee id is valid");
			}
		}catch (EmployeeException e) {
			e.printStackTrace();
		}
	}
}
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee ob=new Employee();
ob.checkId(9999);
	}

}
