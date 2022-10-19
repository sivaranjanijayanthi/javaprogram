package comedu;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int sid;
	String sname;
	float fess;
public Student(int sid, String sname, float fess) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fess = fess;
	}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", fess=" + fess + "]";
}

}

public class ArrayListUserDefinedObject {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1 ,"Shiva" , 647.8f);
		Student s2=new Student(2, "Dhiys" , 4637.8f);
		Student s3=new Student(3,"Abiya " , 7367.5f);
		 ArrayList<Student> sobj=new ArrayList<Student>();
		sobj.add(s1);
		sobj.add(s2);
		sobj.add(s3);
		System.out.println(sobj);
		//using iterator
		Iterator<Student> sit=sobj.iterator(); 
		System.out.println("ID\tNAME\tFEES"); 
		
		while(sit.hasNext()){
			Student st1=sit.next();
			System.out.println(st1.sid+"\t"+st1.sname+"\t"+st1.fess);
		}
		
	}

}
