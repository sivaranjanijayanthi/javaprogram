package comedu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {
		Set<String> str=new HashSet<String>();
		int size=str.size();
		System.out.println("Before adding Elements" );
		str.add("Red");
		str.add("Blue");
		str.add(" Green");
		str.add("Orange");
		str.add("Yellow");
		str.add("Red");
		str.add("Blue");
		System.out.println("Unorderd set elements ");
		System.out.println(str);
		if(str.equals("Black")) {
			System.out.println(" Black is not present in the set ");
		}else {
			str.add("Black");
			System.out.println("Black is added successfully");
			System.out.println("After adding element ");
			System.out.println(str);
			System.out.println("LinkedHashSet");
			Set<String>str1=new LinkedHashSet<String>();
			str.add("Brown");
			str.add("Purple");
			str.addAll(str1);
			System.out.println("After adding elements");
			System.out.println(str);
			Iterator<String>sit=str.iterator();
			while(sit.hasNext()) {
				System.out.println(sit.next());
			}
		}

	}

}
