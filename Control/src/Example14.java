import java.util.Scanner;

public class Example14 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int m1, m2, m3, sum, select;
		double ave;
		System.out.print("���� ����");
		m1 = inData.nextInt();
		System.out.print("���� ����");
		m2 = inData.nextInt();
		System.out.print("���� ����");
		m3 = inData.nextInt();
		sum = m1 + m2 + m3;
		ave = sum/3.0;
		System.out.println("��� : " + ave);
		System.out.print("1.90���̻� 2.80���̻� 3.70���̻� 4.60���̻� 5.60������");
		select = inData.nextInt();
		switch(select){
		case 1:
			System.out.println("A����");
			break;
		case 2:
			System.out.println("B����");
			break;
		case 3:
			System.out.println("C����");
			break;
		case 4:
			System.out.println("D����");
			break;
		case 5:
			System.out.println("F����");
			break;
		}
		inData.close();
	}
}
