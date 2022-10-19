package com.edubri;
class Balance extends Exception {
	public Balance(String s) {
		super(s);
	}
}
class bankData{
	float amount;
	public bankData() {
		amount=6000;
	}
	void withdraw(float wamount) {
		try {
			if(amount<wamount) {
			throw new Balance("Insufficient balance");
		}else {
			amount=amount-wamount;
			System.out.println(" balance ="+amount);
		}
		
	}catch(Balance e) {
		e.printStackTrace();
	}
	}
}
public class BankAc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bankData ob=new bankData();
ob.withdraw(700);
	}

}
