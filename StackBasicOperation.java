package comedu;

import java.util.Iterator;
import java.util.Stack;

public class StackBasicOperation {

	public static void main(String[] args) {
		Stack<Integer> sob=new Stack <Integer> ();
		sob.push(56);
	    sob.push(67);
	    sob.push(67);
	    System.out.println(sob);
	    System.out.println( "Pop operation"  +sob.pop());
	    Iterator<Integer> itstack=sob.iterator();
	    while(itstack.hasNext()) {
	    	System.out.println(itstack.next());
	    }
	}

}
