package Sivajay;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s1="hello";
				String s2="hello";
				
				String s3=new String("hi");
				String s4=new String("HI");
				
				if(s1==s2) { //compare memory location
					System.out.println("both pointing to same memory");
				}else {
					System.out.println("Not pointing same memory");
				}
				//String literal using new keyword
				if(s3==s4) { //compare memory location
					System.out.println("both pointing to same memory");
				}else {
					System.out.println("Not pointing same memory");
				}
				
				//check the contents
				if(s1.equals(s3)) {
					System.out.println("bot are equal");
				}else {
					System.out.println("Not equal");
				}
				
				if(s3.equalsIgnoreCase(s4)) {
					System.out.println("bot are equal");
				}else {
					System.out.println("Not equal");
				}
			}

		}
	
