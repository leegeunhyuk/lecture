import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		//
		// Person p = new Person("������");
		//
		// set.add(p);
		// set.add(new Person("�迬��"));
		// set.add(p);
		// set.add(new Person("������"));
		// System.out.println(set.size());
		// System.out.println(set.toString());
		//

		String str = "Java";

		set.add(str);
		set.add(new String("C"));
		set.add(new String("Android"));
		set.add(str);
		set.add("C");
		
		Iterator<String> it =set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s.toString());
		}
		
		
//		
//		System.out.println(set.size());
//		System.out.println(set);

	}
}
