//Design a class to overload a function volume() as follows:

/*(i)double volume(double r) – with radius ‘r’ as an argument, 
returns the volume of sphere using the formula: v = 4 / 3 × 22 / 7 × r3

(ii)double volume(double h, double r) – with height ‘h’ and radius ‘r’ as the arguments,
returns the volume of a cylinder using the formula: v = 22 / 7 × r2 × h
 
(iii) double volume(double l, double b, double h) –
with length ‘l’, breadth ‘b’ and height ‘h’ as the arguments, 
returns the volume of a cuboid using the formula: v = l × b × h*/



package encapsuation;

public class FunctionOverloadVolume {
	double vol;
	double volume(double r) {
		double vol=(4/3)*(22/7)*r*r*r;
		return vol;
		}
	double volume(double r,double h) {
		double vol=(22/7)*r*r*h;
		return vol;
		}
	double volume(double h,double b,double l) {
		double vol=l*b*h;
		return vol;
		}

	public static void main(String[] args) {
		FunctionOverloadVolume ob=new FunctionOverloadVolume();
	System.out.println("Sphere volume="+ob.volume(4));
	System.out.println("Cylinder volume="+ob.volume(3,4.5));
	System.out.println("Cuboid volume="+ob.volume(4,4.3,4.2));

	}


	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


