import javax.print.attribute.standard.JobHoldUntil;

public class Person {
    int unique_id;
    String name;
    int age;
    String city;
    String gender;
    public Person(String name, int age, String city, String gender) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    void eat(){
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("sleep");
    }
    void study(){
        System.out.println("study");
    }
    void play(){
        System.out.println("play");
    }

    void printInfoPerson(){
        System.out.println("==========\nTen: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("City: "+city);
        System.out.println("Gioi tinh: "+gender);
    }

    public static void main(String[] args) {
        Person john = new Person("John", 35, "Delhi", "male");
        Person dessy = new Person("Dessy", 20, "Pune", "female");
        john.printInfoPerson();
        dessy.printInfoPerson();
    }
}
