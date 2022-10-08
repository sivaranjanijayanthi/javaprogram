package comedu;
 class Bank{
	float RateOfInterest() {
		return 0f;
	}
}
class SBI extends Bank{
	float RateOfInterest() {
		return 8f;
	}
}
class AXIS extends Bank{
	float RateOfInterest() {
		return 89.0f;
		
	}
}
class INDIANBANK extends Bank{
	float RateOfInterest() {
		return 8.5f;
}
}
public class BankMain {

	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("Rate Of Interest is = " +b.RateOfInterest());
		b=new AXIS();
		System.out.println("Rate Of Interest = " +b.RateOfInterest());
		b=new INDIANBANK();
		System.out.println("Rate Of Interest = " +b.RateOfInterest());
		
	}

}
