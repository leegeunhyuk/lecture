import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner inData = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է� : ");
		num1 = inData.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		num2 = inData.nextInt();
		
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + ((float)num1 / num2));
	}
}
