package sivajaya;

import java.util.Scanner;

public class VowelsorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method 
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        ch=sc.next().charAt(0);
        if(ch=='A')
        {
        	System.out.println(ch+"is an vowel");
        }
        else if(ch=='E' )
        {
        	System.out.println(ch+ "is an vowel");
        }
        else if(ch=='I')
        {
        	System.out.println(ch+"is an vowel");
        }
        else if(ch=='O')
        {
        	System.out.println(ch+"is an vowel");
        }
        else if(ch=='U')
        {
        	System.out.println(ch+"is an vowel");
        }
        else {
        	System.out.println(ch+"is a consonant");
        }
        	
	}

}
