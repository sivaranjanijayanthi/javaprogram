package siva.Lab;
class parentclass{
	int a=10;
	public int b=20;
 	 protected int c=30;
 	 private int d=40;
 	 void showData() {
 		 System.out.println("inside parentclass");
 		 System.out.println("a =" +a);
 		System.out.println("b =" +b);
 		System.out.println("c =" +c);
 		System.out.println("d =" +d);
		 
		  
 	 }
	
}
class childclass extends parentclass{
	void accessData() {
		System.out.println("inside childclass");
		 System.out.println("a =" +a);
		System.out.println("b =" +b);
		System.out.println("c =" +c);
		 
	}
}
public class LabActivity15 {

	public static void main(String[] args) {
		childclass obj=new childclass();
		obj.showData();
		obj.accessData();
	}

}
