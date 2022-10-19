package comedu;

import java.util.Vector;

public class BasicVectorOperations {
	public static void main(String[] args) {
		Vector<String> vct=new Vector<String>();
		//adding elements
		vct.add( "Siva");
		vct.add("Suvi");
		vct.add("Dhiya");
		System.out.println(vct);
		//adding elemnt from specific elements
		vct.add(2, "Abi");
		System.out.println("After adding");
		System.out.println(vct);
		//geting elements  by index
		System.out.println("The getting  element  index 2: " +vct.get(2));
		vct.remove(2);
		System.out.println("after remove" +vct);
		//getting first element
		System.out.println("the first element in array " +vct.firstElement());
		System.out.println("last element in this vector " +vct.lastElement());
		//check empty
		System.out.println("the vector is empty or not" +vct.isEmpty());
	}

}
