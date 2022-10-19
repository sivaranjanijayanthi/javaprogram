package com.edubri;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {6,4,3};
     System.out.println("Before print");
     System.out.println("first element =" +a[0]);
     System.out.println("2nd element =" +a[1]);
     System.out.println("3rd element =" +a[2]);
     try {
    	 System.out.println("first element =" +a[3]);
         
     }catch(ArrayIndexOutOfBoundsException e) {
    	// System.out.println(e);
         e.printStackTrace();
     }finally {
    	 System.out.println("finally execute always even exceptions occur or not");
     }
     System.out.println("hello dude");
	}

}
