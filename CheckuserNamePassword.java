package Sivajay;

import java.util.Scanner;

public class CheckuserNamePassword {

	public static void main(String[] args) {
		String UName,Upwd;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		UName=sc.next();
		System.out.println("enter user password");
		Upwd=sc.next();
		if(UName.equalsIgnoreCase("siva") && Upwd.equals("siva124")){
			System.out.println("valid user");
		}else {
			System.out.println("invalid useer");
		}
	}

}
