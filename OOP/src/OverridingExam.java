
public class OverridingExam {

	public static void main(String[] args) {
		String str = "Java";
		Integer i = 5;
		
		Person p = new Person("ȣ");
		Object obj = new Object();
		System.out.println(i.toString());
		System.out.println(obj.toString());
		
		System.out.println(p.toString());
		
		System.out.println(p);
	}
}
