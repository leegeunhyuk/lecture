
public class InheritanceTest {

	public static void main(String[] args) {
//		Cartoon c = new Cartoon();

		Child c = new Child();
		c.print();
		c.myPrint();
		
		Parent p = new Parent();
		p.print();
		System.out.println(p.toString());
		Parent testP = new Child();  // up-casting
		testP.print();
		
		Child testC = (Child)testP; // down-casting
	}
}
