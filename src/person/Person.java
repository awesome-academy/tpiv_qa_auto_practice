package person;

public class Person {
	// data members
	private String id;
    private String name;
    private int age;
    private String city;
    private String gender;
    
    // constructor
    public Person(String id, String name, int age, String city, String gender) {
    	this.id = id;
    	this.name = name;
    	this.age = age;
    	this.city = city;
    	this.gender = gender;
    }
    
    // methods
    public void eat() {
        System.out.println("status:" + name + " is eating.");
    }

    public void study() {
        System.out.println("status:" + name + " is studying.");
    }

    public void sleep() {
        System.out.println("status:" + name + " is sleeping.");
    }

    public void play() {
        System.out.println("status:" + name + " is playing.");
    }
    
    public void displayInfo() {
    	System.out.println("----o0o---- \n");
        System.out.println("Unique ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Gender: " + gender);
    }
    
    public static void main(String[] args) {
    	// Create objects
    	Person member1 = new Person ("1", "John", 35 , "Delhi", "male");
    	Person member2 = new Person ("2", "Dessy", 20 , "Pune", "famale");
    	
    	// Display information
    	member1.displayInfo();
    	member2.displayInfo();
    }
    
}
