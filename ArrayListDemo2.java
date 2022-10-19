package comedu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		int num,n;
		ArrayList<Integer> iob=new ArrayList<Integer>();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the elements in array");
		n=sc.nextInt();
		System.out.println(" Enter " +n+ "roll number");
		for(int i=0;i<n;i++) {
			num=sc.nextInt();
			iob.add(num);
		}
		//display using object
		System.out.println(iob);
		//display using enhanced for loop or each loop
		for(int i: iob) {
			System.out.println(i);
		}
		//using iterator
		System.out.println("Display using Iterator");
		Iterator<Integer>it=iob.iterator();
		while(it.hasNext()) {  //return true if there is an element
			System.out.println(it.next());
		}
		
	}

}
