import java.math.BigDecimal;

public class WrapperExam {
	public static void main(String[] args) {
		Integer i = 10; // Integer i = new Integer(10);

		double da1 = 1.6;
		double da2 = 0.1;
	
		System.out.println();
		
		BigDecimal bda1 = BigDecimal.valueOf(1.6);
		BigDecimal bda2 = BigDecimal.valueOf(1.6);
		
		System.out.println(bda1.add(bda2));
	}
}