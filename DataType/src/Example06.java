import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		int num;
		Scanner inData = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		num = inData.nextInt();
		System.out.println(num + "�� 2��� => " + (num * 2));
		System.out.println(num + "�� ���� => " + (num * num));
	}
}
