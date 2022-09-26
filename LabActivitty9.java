package siva.Lab;

public class LabActivitty9 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Information");
		str.append("Technology");
		System.out.println( str);
		str.insert(8, "Engineering");
		System.out.println(str);
		str.replace( 8,16,"IT");
		str.reverse();
		System.out.println(str);
		System.out.println(str.capacity());

	}

}
