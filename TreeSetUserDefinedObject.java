package comedu;

//public class TreeSetUserDefinedObject {

	import java.util.Comparator;
	import java.util.Set;
	import java.util.TreeSet;

	class EduStudent1{
		int sid;
		String sname;
		float sfees;
		public EduStudent1(int sid, String sname, float sfees) {
			super(); //Object class constructor is called
			this.sid = sid;
			this.sname = sname;
			this.sfees = sfees;
		}
		@Override
		public String toString() {
			return "EduStudent [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
		}
		
	}
	class StudentSortSidDetails implements Comparator<EduStudent1>{

		@Override
		public int compare(EduStudent1 o1, EduStudent1 o2) {
			if(o1.sid==o2.sid) 
			    return 0;
			else if(o1.sid<o2.sid)
				return -1;
			else
				return 1;
						
		}
		
	}

	class StudentSortNameDetails implements Comparator<EduStudent1>{

		@Override
		public int compare(EduStudent1 o1, EduStudent1 o2) {
			return  o1.sname.compareToIgnoreCase(o2.sname);
		}
	}
	class StudentSortFeesDetails implements Comparator<EduStudent1>{

		@Override
		public int compare(EduStudent1 o1, EduStudent1 o2) {
			if(o1.sfees==o2.sfees) 
			    return 0;
			else if(o1.sfees<o2.sfees)
				return -1;
			else
				return 1;
						
		}
	}
	public class TreeSetUserDefinedObject {

		public static void main(String[] args) {
			EduStudent1 s1=new EduStudent1(5,"Nalini",78654.5f);
			EduStudent1 s2=new EduStudent1(2,"Devika",7665.4f);
			EduStudent1 s3=new EduStudent1(3,"Shivamma",7643.2f);
			
			StudentSortSidDetails sob=new StudentSortSidDetails();
			
			Set<EduStudent1> tob=new TreeSet<EduStudent1>(sob);
			tob.add(s1);
			tob.add(s2);
			tob.add(s3);
			
			System.out.println(tob);
		
			//based on name
			StudentSortNameDetails sob1=new StudentSortNameDetails();
			Set<EduStudent1> tob1=new TreeSet<EduStudent1>(sob1);
			tob1.add(s1);
			tob1.add(s2);
			tob1.add(s3);
			
			System.out.println("Sorted Based on Names");
			System.out.println(tob1);
			
			//Based on fees
			StudentSortFeesDetails sob2=new StudentSortFeesDetails();
			Set<EduStudent1>tob2=new TreeSet<EduStudent1>(sob2);
			tob2.add(s1);
			tob2.add(s2);
			tob2.add(s3);
			System.out.println("Sorted based on Fees");
			System.out.println(tob2);
		}
		
	}
