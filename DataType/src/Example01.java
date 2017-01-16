
public class Example01 {

	public static void main(String [] args){
		int won = 278970;
		System.out.println("10000원권 => " + won/10000 + "개");
		won = won - won/10000 * 10000;
		System.out.println(" 5000원권 => " + won/5000 + "개");
		won = won - won/5000 * 5000;
		System.out.println(" 1000원권 => " + won/1000 + "개");
		won = won - won/1000 * 1000;
		System.out.println("  500원권 => " + won/500 + "개");
		won = won - won/500 * 500;
		System.out.println("  100원권 => " + won/100 + "개");
		won = won - won/100 * 100;
		System.out.println("   50원권 => " + won/50 + "개");
		won = won - won/50 * 50;
		System.out.println("   10원권 => " + won/10 + "개");
		won = won - won/10 * 10;
		
	}
}
