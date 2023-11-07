
public class Main {
	public static void main(String[] args) {
		Person person1 = new Person(1, "John", 35, "Delhi", "male");
		Person person2 = new Person(2, "Dessy", 20, "Pune", "female");
		
		// Show info of 2 objects
		person1.printAllInfo();
		System.out.println("---");
		person2.printAllInfo();
		
		
	}
}
