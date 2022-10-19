package com.edubri;
class productException extends Exception{
	public productException(String s) {
		super(s);
	}
}
class product{
	void productPrice(float price) {
		try {
			if(price<=0 || price>=10000) {
				throw new  productException("invalid price");
			}else {
				System.out.println("valid price");
			}
		}catch (productException e) {
			e.printStackTrace();
		}
	}
}
public class ProductMain {

	public static void main(String[] args) {
		product ob=new product();
		ob.productPrice(1000);

	}

}
