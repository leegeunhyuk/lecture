import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		System.out.print("*�� ���� �Է��Ͻÿ� : ");
		int num = inData.nextInt();
		System.out.println(num + "����" + (num/7) + "�� " + (num%7) + "�� �Դϴ�.");
	}
}
