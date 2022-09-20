package siva;
import java.util.Scanner;
public class SwitchCharacter {
	public static void main(String[] args) {
     char ch;
     Scanner sc=new Scanner(System.in);	
     System.out.println (" enter the character");
     ch=sc.next().charAt(0);
     switch(ch) {
     case 'A', 'a', 'E', 'e' , 'I', 'i' ,'O', 'o','U', 'u':
  
    	 System.out.println(ch+" is an vowel");
    	 break;
    	 default:System.out.println(ch+ "is an consonant"); 
     }

}
}