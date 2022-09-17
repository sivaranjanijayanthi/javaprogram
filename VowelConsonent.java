package sivajaya;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char ch;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter a character");
	        ch=sc.next().charAt(0);
	        if(ch=='A' || ch=='E'||ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'||ch=='e'|| ch=='o'
	        		||ch=='u') {
	        	System.out.println(ch+"is an vowel");
	        }
	        else {
	        	System.out.println(ch+"is an consonant");
	        }
	}

}
