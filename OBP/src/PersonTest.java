
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("����");
		System.out.println(p1.getName());
		p1.setAge(938);
		System.out.println(p1.getAge());
		
		Person p2 = new Person("�̱���", 27);
		Person p3 = new Person(27, "�̱���");
		System.out.println(p3.getName());
	}
}
