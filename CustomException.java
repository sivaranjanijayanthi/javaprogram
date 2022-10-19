package com.edubri;

import java.util.Scanner;

class checkAgeVoting extends Exception{
	public checkAgeVoting(String s) {
		super (s);
	}
}
class personAge{
	int age;
	void inputAge() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr aage");
		age=sc.nextInt();
		try {
if(age<18) {
	throw new checkAgeVoting ("Not eligible for voting");
}else {
	System.out.println("Eligible for voting");
}
}
	catch (checkAgeVoting e){
e.printStackTrace();
}
}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		personAge ob=new personAge();
		ob.inputAge();
	}

}
