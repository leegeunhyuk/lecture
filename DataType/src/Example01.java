
public class Example01 {

	public static void main(String [] args){
		int won = 278970;
		System.out.println("10000���� => " + won/10000 + "��");
		won = won - won/10000 * 10000;
		System.out.println(" 5000���� => " + won/5000 + "��");
		won = won - won/5000 * 5000;
		System.out.println(" 1000���� => " + won/1000 + "��");
		won = won - won/1000 * 1000;
		System.out.println("  500���� => " + won/500 + "��");
		won = won - won/500 * 500;
		System.out.println("  100���� => " + won/100 + "��");
		won = won - won/100 * 100;
		System.out.println("   50���� => " + won/50 + "��");
		won = won - won/50 * 50;
		System.out.println("   10���� => " + won/10 + "��");
		won = won - won/10 * 10;
		
	}
}
