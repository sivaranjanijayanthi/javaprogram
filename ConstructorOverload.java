package encapsuation;
class MyClassConstructor{
	int i,j,k;
	MyClassConstructor(){
		System.out.println("constructor with no arguements");
	}
	MyClassConstructor(int i){
		System.out.println("constructor with one arguements" +i);
	}
	MyClassConstructor(int i ,int j){
		System.out.println("constructor with two arguements"+i+ "and" +j);
	}
	MyClassConstructor(int i ,int j,int k){
		System.out.println("constructor with three arguements"+i+" , "+j+" and" +k);
	}	
	
}

public class ConstructorOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassConstructor obj1=new MyClassConstructor();
		MyClassConstructor obj2=new MyClassConstructor(5);
		MyClassConstructor obj3=new MyClassConstructor(5,7);
		MyClassConstructor obj4=new MyClassConstructor(5,7,8);

	}

}
