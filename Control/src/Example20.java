import java.util.Scanner;

public class Example20 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int total = 0;
		for(int i = 1; i<100; i+=2){
			total += i;
			System.out.println("È¦¼öÇÕ(" + i + ") = " + total);
		}
	}
}
