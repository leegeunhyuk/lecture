import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int year;
		System.out.print("�⵵�� �Է��Ͻÿ� : ");
		year = inData.nextInt();
		if(year%4 == 0) {
			if(year%100 == 0){
				if(year%400 == 0){
					System.out.println(year + "���� ����(Leap year)�Դϴ�.");
				}
				else System.out.println(year + "���� ���(Common year)�Դϴ�.");
			}
			else System.out.println(year + "���� ����(Leap year)�Դϴ�.");
		}
		else System.out.println(year + "���� ���(Common year)�Դϴ�.");
		inData.close();
	}
}
