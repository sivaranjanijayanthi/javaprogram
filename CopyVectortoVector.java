package comedu;

import java.util.Vector;

public class CopyVectortoVector {

	public static void main(String[] args) {
		Vector<String> vct=new Vector<String>();
		vct.add("Jay");
		vct.add("Logi");
		vct.add("Siva");
		System.out.println("Original vector" +vct);
		Vector<String >copy= (Vector<String>)vct.clone();
		System.out.println("Aftr copied " +copy);
		

	}

}
