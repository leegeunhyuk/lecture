import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		Scanner inData = new Scanner(System.in);
		int s1, s2, s3, sum;
		double ave;
		System.out.print("���� ���� : ");
		s1 = inData.nextInt();
		System.out.print("���� ���� : ");
		s2 = inData.nextInt();
		System.out.print("���� ���� : ");
		s3 = inData.nextInt();
		sum = s1 + s2 + s3;
		ave = sum/3.0;
		System.out.println("���� : " + sum);
		System.out.println("���  : " + ave);
		
		if(ave >= 90) System.out.println("A����");
		else if(ave >= 80) System.out.println("B����");
		else if(ave >= 70) System.out.println("C����");
		else if(ave >= 60) System.out.println("D����");
		else System.out.println("F����");
		inData.close();
	}
}
