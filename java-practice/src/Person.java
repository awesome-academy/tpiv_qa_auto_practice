public class Person {
//khai bao data members
	String name;
	int age;
	String city;
	String gender;
	
//khai bao method lay thong tin person
public String getInfo(){
	return ("Name: " + name + ", Age: " + age + ", City: " + city + ", Gender: " + gender);
  }
	
//khai bao method eat
 
//khai bao method learn

//khai bao phuong thuc sleep

//khai bao phuong thuc play

//Tất cả được thực thi từ trong hàm Main
 public static void main(String[] args) {
 	//Tao ra  person
 	Person person1 = new Person();
	Person person2 = new Person();
 	
 	//Gán đặc điểm cho Person1
 	person1.name = "John";
 	person1.age = 35;
 	person1.city = "Delhi";
 	person1.gender = "Male";
 	
	person2.name = "Dessi";
 	person2.age = 20;
 	person2.city = "Pune";
 	person2.gender = "Female";
 	
 	
 	System.out.println(person1.getInfo());
 	System.out.println(person2.getInfo());
 }
}