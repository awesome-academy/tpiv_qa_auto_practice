import java.util.UUID;

public class Person {
    private UUID id;
    private String name;
    private int age;
    private String city;
    private String gender;

    public Person(){}

    public Person(String name, int age, String city, String gender){
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    public void setId(String id){
        this.id = UUID.fromString(id);
    }

    public String getId(){
        return String.valueOf(this.id);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public void showInfo(){
        System.out.println("Information of Person " + this.name + ":");
        System.out.println("Age: " + this.age);
        System.out.println("City: " + this.city);
        System.out.println("Gender: " + this.gender + "\n");
    }

    public void eat(){
        System.out.println("Method eat");
    }

    public void study(){
        System.out.println("Method study");
    }

    public void sleep(){
        System.out.println("Method sleep");
    }

    public void play(){
        System.out.println("Method play");
    }

    public static void main(String[] args){
        Person Man = new Person("John", 35, "Delhi", "male");
        Person Woman = new Person("Dessy", 20, "Pune", "female");

        Man.showInfo();
        Woman.showInfo();
    }
}
