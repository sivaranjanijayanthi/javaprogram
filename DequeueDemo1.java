package comedu;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeueDemo1 {
	public static void main(String[] args) {
		Deque<Integer>dob=new ArrayDeque<Integer>();
		dob.add(3);
		dob.add(7);
		dob.add(8);
		dob.add(15);
		System.out.println("Inserting elements");
		for(int i :dob) {
			System.out.println(i);
		}
		dob.pop();
		System.out.println("After Popping");
		for(int i :dob) {
			System.out.println(i);
		}
		dob.remove(8);
		System.out.println("After Removing");
		for(int i :dob) {
			System.out.println(i);
		}
	}

}
