package interexam;

public class Test {

	public static void main(String[] args) {

//		IBehavior i;

		IBehavior[] ib = new IBehavior[3];

		ib[0] = new Soccer();
		ib[1] = new Guiter();
		ib[2] = new Soccer();

		for (int i = 0; i < ib.length; i++) {
			ib[i].play();

		}

		// Soccer s = new Soccer();
		// Guiter g = new Guiter();

		// s.play();
		// g.play();
	}
}
