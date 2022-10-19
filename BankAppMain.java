package com.edubri;
class BankBalance extends Exception{
	public BankBalance(String s) {
		super(s);
		
	}
	
}
class Bank{
	float amount;
	public Bank() {
		amount=1000;
		
	}
	void withdrraw(float wamount) {
		try {
			if(wamount>amount) {
				throw new BankBalance("insufficient balance  cannot withdraw :");
				
			}else {
				amount=amount-wamount;
				System.out.println("Bank Balance= "+amount);
			}

		}catch(BankBalance e) {
			e.printStackTrace();
		}
	}
	
}

public class BankAppMain {

	public static void main(String[] args) {
		Bank ob=new Bank();
		ob.withdrraw(5000);

	}

}
