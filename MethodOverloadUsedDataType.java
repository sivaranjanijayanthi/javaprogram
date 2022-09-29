package encapsuation;
class DataTypes{
	void addition(int a,int b) {
		int c=a+b;
		System.out.println("Addition of integer number is " +c);
	}
	void addition(float a,float b) {
		float c=a+b;
		System.out.println("Addition of float number is " +c);
}
	void addition(double a,double b) {
		double c=a+b;
		System.out.println("Addition of double number is " +c);
	}
	void addition(short a,short b) {
		short c=(short) (a+b);
		System.out.println("Addition of short number is " +c);
	}
	void addition(byte a,byte b) {
		byte c= (byte) (a+b);
		System.out.println("Addition of byte number is " +c);
	}
	void addition(long a,long b) {
		long c= (long) (a+b);
		System.out.println("Addition of Long number is " +c);
	}
}
	public class MethodOverloadUsedDataType {
		
	public static void main(String[] args) {
		 DataTypes ob=new  DataTypes();
		 ob.addition(6, 7);
		 ob.addition(2.7f, 6.5f);
		 ob.addition((short) 56,(short) 76);
		 ob.addition(56l, 78l);
		 ob.addition(7.8, 9.8);

	}

	}



