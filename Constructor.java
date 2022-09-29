package encapsuation;

public class Constructor { //constructor is same name as class and contructor will not have return type
int i;
String s;
float sal;//instance variables
Constructor(){//no arguements
	i=10;
	s="suvi";
	sal=5678.9f;
}
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		//constructor have implicit call
		System.out.println("i =" +obj.i);
		System.out.println("s =" +obj.s);
		System.out.println("sal =" +obj.sal);

	}

}
