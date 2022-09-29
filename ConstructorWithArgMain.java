package encapsuation;
class StudentEdu{
	int sid;
	String sname;
	float sfees;
	public StudentEdu(int sid,String sname,float sfees) {
		this.sid=sid;
		this.sname=sname;
		this.sfees=sfees;	
	}

	void display() {
		System.out.println("Student id="+sid);
		System.out.println("Student name="+sname);
		System.out.println("Student fees="+sfees);
	}
}

public class ConstructorWithArgMain {

	public static void main(String[] args) {
	 StudentEdu sob1=new StudentEdu(1,"Suvi",5664.89f);
	 StudentEdu sob2=new StudentEdu(2,"Dhiya",6788.98f);
	StudentEdu sob3 =new StudentEdu (3,"Abi",33229.89f);
		sob1.display();
		sob2.display();
		sob3.display();
		
		
	}

}