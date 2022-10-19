//non generic arraylist
package comedu;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		//Resizable array
		ArrayList lob=new ArrayList();
		lob.add(34);
		lob.add(87.4f);
		lob.add(9.56);
		lob.add("Hello");
		lob.add(true);
		lob.add(6);

		//declare arraylist in float
		ArrayList<Float> fob=new ArrayList<Float>();
		fob.add(5.7f);
		fob.add(4.5f);
		fob.add(6.9f);
		System.out.println(fob);
		//for loop
		for(float i: fob) {
			System.out.println(i);
		}
		//declare array using string
		ArrayList<String> sob=new ArrayList<String>();
		sob.add("Siva");
		sob.add("jaya");
		sob.add("logi");
		System.out.println(sob);
		for(String i:sob) {
			System.out.println(sob);
		}
		//declare arraylist in double
		ArrayList<Double>dob=new ArrayList<Double>();
		dob.add(4577787d);
		dob.add(879899d);
		for(double i:dob) {
			System.out.println(i);
		}
   }
 }

	

