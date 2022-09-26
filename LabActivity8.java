package siva.Lab;

public class LabActivity8 {

	public static void main(String[] args) {
		String a="Information";
		System.out.println("String a =" +a);
		String b=new String("Technology");
		System.out.println("String b=" +b);
		System.out.println("The length of the string"  + a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a+b);
		System.out.println("chracter at position 5 :" +a.charAt(5));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.compareTo(b));
		System.out.println(a.contains("X"));

	}

}
