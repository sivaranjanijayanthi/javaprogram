package comedu;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class SetExample3 {
	public static void main(String[] args) {
		List<Integer> lob=new ArrayList<Integer>();
		lob.add(5);
		lob.add(8);
		lob.add(7);
		lob.add(20);
		lob.add(5);
		lob.add(8);
		lob.add(78);
		System.out.println("Before ArrayList");
		System.out.println(lob);
		Set<Integer> lob1=new LinkedHashSet<Integer>(lob);
		System.out.println("unordered list after removing dubicates");
		System.out.println(lob1);
		Set<Integer>lob2=new TreeSet<Integer>(lob1);
		System.out.println("After removing Dublicates to print ascending order");
		System.out.println(lob2);
}
}