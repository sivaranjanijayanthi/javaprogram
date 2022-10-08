package comedu;
class parent {
	void show() {
		System.out.println("parent class");
	}
}
class child extends parent{
	void show() {
		System.out.println("child class");
		super.show();//super class is used in overridden method
	}
	
}
public class FunctionOverriding {

	public static void main(String[] args) {
		child ob=new child();
        ob.show();
        parent obj=new parent();
        obj.show();//parent call directly
	}

}
