import java.util.Scanner;

public class Example23 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int num;
		System.out.print("* ������ �Է��Ͻÿ� : ");
		num = inData.nextInt();
		for(int i = num; i <= num + 10; i++){
			System.out.print("[" + i + "]");
		}
	}
}
