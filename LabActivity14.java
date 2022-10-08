package siva.Lab;
class city{
	String name;
	long population;

void display() {
	System.out.println("city name :" +name);
	System.out.println("population :" +population);
}
	
}
public class LabActivity14 {

	public static void main(String[] args) {
 city metro1,metro2;
 metro1=new city();
 metro2 = new city();
 metro1.name="India";
 metro1.population=565767665;
 System.out.println("Details of city1");
 metro1.display();
 metro2.name="Chennai";
 metro2.population=88788782;
 System.out.println("Details of city2");
 metro2.display();
 
 
	}

}
