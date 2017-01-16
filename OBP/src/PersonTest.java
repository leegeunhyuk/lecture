
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("«œ¿Ã");
		System.out.println(p1.getName());
		p1.setAge(938);
		System.out.println(p1.getAge());
		
		Person p2 = new Person("¿Ã±Ÿ«ı", 27);
		Person p3 = new Person(27, "¿Ã±Ÿ«ı");
		System.out.println(p3.getName());
	}
}
