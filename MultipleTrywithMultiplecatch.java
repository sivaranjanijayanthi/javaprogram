package com.edubri;
public class MultipleTrywithMultiplecatch {
	public static void main(String[] args) {
		int a=10,b=0,c=0;
		int ar[]= {4,8,2,3};
		try {
			c=a/b;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
  		try {
			ar[9]=34;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		finally {
		   System.out.println("Finally block");	
		}
		
	}

}



	