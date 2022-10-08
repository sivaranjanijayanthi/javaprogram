package abstct;

abstract class Bank{
	abstract float getRateOfInterest();
	void display() {
		System.out.println("display");
	}
}
class SBIBank extends Bank{

	@Override
	float getRateOfInterest() {
		
		return 7.9f;
	}
}
public class BankAbsBankMain {

	public static void main(String[] args) {
		Bank ob=new SBIBank();
		System.out.println("Rate of interest="+ob.getRateOfInterest());
		ob.display();

	}
}
