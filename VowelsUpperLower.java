package sivajaya;

	import java.util.Scanner;
	public class VowelsUpperLower {
		public static void main(String[] args) {
			// TODO Auto-generated method 
	        char ch;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter a character");
	        ch=sc.next().charAt(0);
	        if(ch=='A'|| ch=='a')
	        {
	        	System.out.println(ch+"is an vowel");
	        }
	        else if(ch=='E' || ch=='e')
	        {
	        	System.out.println(ch+ "is an vowel");
	        }
	        else if(ch=='I'|| ch=='i')
	        {
	        	System.out.println(ch+"is an vowel");
	        }
	        else if(ch=='O'|| ch=='o')
	        {
	        	System.out.println(ch+"is an vowel");
	        }
	        else if(ch=='U' || ch=='u')
	        {
	        	System.out.println(ch+"is an vowel");
	        }
	        else {
	        	System.out.println(ch+"is a consonant");
	        }
	        	
		}
	
	
	


	}


