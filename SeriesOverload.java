
package encapsuation;

public class SeriesOverload {
	void series(int x, int n) {
		float sum=0;
		for(int i=1;i<=n;i++) {
			sum=(float) (sum+Math.pow(x,  i));
		}
		System.out.println( "Sum of the given series =" +sum);
	}
void series( int p) {
	int t;
	for(int i=1; i<=p;i++) {
		t=(i*i*i)-1;
		System.out.println(t + " ,");	
	}
	System.out.println();
}
void series() {
	float sum=0;
	for(int i=2;i<=9;i++) {
		sum=sum+(float)1/i;
	}
	System.out.println("Sum of the given series =" +sum);
}
	public static void main(String[] args) {
		SeriesOverload obj=new SeriesOverload();
		obj.series(2,10);
		obj.series(10);
		obj.series(9);
		

	}

}
