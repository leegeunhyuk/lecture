
public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person(int age, String name){
		this.name = name;
		this.age = age + 1;
	}
	public Person(){
		this.name = "기타누락자";
		this. age = 0;
	}
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
}
