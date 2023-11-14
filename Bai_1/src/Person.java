
public class Person {
	private int unique_id;
	private String name;
	private int age;
	private String city;
	private String gender;

	public Person(int unique_id, String name, int age, String city, String gender) {
		this.unique_id = unique_id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.gender = gender;
	}

	// Action:
	public void eat() {
		System.out.println("...eat...");
	}

	public void study() {
		System.out.println("...study...");
	}
	
	public void sleep() {
		System.out.println("...sleep...");
	}
	
	public void play() {
		System.out.println("...play...");
	}
	
	//Print information
	public int printUnique_id() {
		return this.unique_id;
	}
	
	public String printName() {
		return this.name;
	}
	
	public int printAge() {
		return this.age;
	}
	
	public String printCity() {
		return this.city;
	}
	
	public String printGender() {
		return this.gender;
	}
	
	public void printAllInfo() {
		System.out.println("Id: " + this.unique_id);
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("City: " + this.city);
		System.out.println("Gender: " + this.gender);
	}

}