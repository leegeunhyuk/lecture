import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int num;
		System.out.print("���� �Է� : ");
		num = inData.nextInt();
		if(num%3 == 0 && num%5 == 0) 
			System.out.println("3�� 5�� �����");
		else if(num%3 == 0)
			System.out.println("3�� ���");
		else if(num%5 ==0)
			System.out.println("5�� ���");
		else System.out.println("��Ÿ ����");
		inData.close();
	}
}
