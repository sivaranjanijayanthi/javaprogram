package comedu;
//HAS-A relation: having an object of one class into another class

class Employe1{
	 float salary;
	  Employe1(){
		  salary=20000;
		  System.out.println("Employee constructor");
	  }
}

class Programmer1{                  
	float bonus,tsal;
	Employee1 eob1=new Employee1(); //HAS-A relation
	public Programmer1() {
		bonus=800;
		System.out.println("Programmer constructor");
	}
	void totalSalary() {
		tsal=eob1.salary+bonus;
		System.out.println("Programmer total salary="+tsal);
	}
}
public class Employee1 {

	public float salary;

	public static void main(String[] args) {
		Programmer1 pob=new Programmer1();
		pob.totalSalary();
	}

}
