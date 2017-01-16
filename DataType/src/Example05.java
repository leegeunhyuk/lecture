import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner inData = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		num1 = inData.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		num2 = inData.nextInt();
		
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + ((float)num1 / num2));
	}
}
