import java.util.Scanner;

public class Example27 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		for(int i = 2; i <= 9; i++){
			for(int j = 1; j <= 9;j++){
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}
