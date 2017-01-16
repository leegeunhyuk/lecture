import java.util.Scanner;

public class Example19 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int n;
		System.out.print("╢э ют╥б : ");
		n = inData.nextInt();
		for(int i=0; i<9; i++){
			System.out.println(n + " * " + (i+1) + " = " + (n*(i+1)));
		}
	}
}
