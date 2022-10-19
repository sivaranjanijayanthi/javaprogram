package comedu;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorItertaor {

	public static void main(String[] args) {
		Vector<String> vit=new Vector<String>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elemnts");
		int n=sc.nextInt();
		System.out.println(" enter " +n+ "vector");
		for(int i=0;i<n;i++) {
			String name=sc.next();
			vit.add(name);
		}
			//System.out.println(vit);
		Iterator<String>itr=vit.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		}
	}


